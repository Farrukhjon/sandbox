package io.github.farrukhjon.experiment.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

public class MongoReplicaSetTestContainer {

    private static final Logger logger = LoggerFactory.getLogger(MongoReplicaSetTestContainer.class);

    private static final String REPLICA_SET_NAME = "rs0";

    private final Network network = Network.newNetwork();

    private static final int MONGO_PORT = 27017;

    private final List<GenericContainer<?>> mongoNodes = new ArrayList<>();

    public MongoReplicaSetTestContainer(int numberOfReplicas) {
        var replicaMembers = new ArrayList<Document>();
        for (int i = 0; i < numberOfReplicas; i++) {
            var netAlias = "mongo" + i;
            var mongoNode = this.createMongoNode(netAlias);
            mongoNode.start();
            this.mongoNodes.add(mongoNode);
            replicaMembers.add(new Document("_id", i).append("host", netAlias + ":" + MONGO_PORT));
        }
        this.initializeReplicaSet(replicaMembers);
    }

    public void stop() {
        this.mongoNodes.forEach(GenericContainer::stop);
        this.network.close();
    }

    private GenericContainer<?> createMongoNode(String networkAlias) {
        return new GenericContainer<>(DockerImageName.parse("mongo:8.0.4"))
            .withExposedPorts(Integer.valueOf(MONGO_PORT))
            .withNetwork(this.network)
            .withNetworkAliases(networkAlias)
            .withCommand("--replSet", REPLICA_SET_NAME, "--bind_ip_all")
            .withLogConsumer(new Slf4jLogConsumer(logger))
            .waitingFor(Wait.forLogMessage("(?i).*waiting for connections.*", 1));
    }

    private void initializeReplicaSet(List<Document> members) {
        try {
            var firstNode = mongoNodes.getFirst();
            var primaryConnectionString = "mongodb://localhost:" + firstNode.getMappedPort(MONGO_PORT);
            try (MongoClient client = MongoClients.create(primaryConnectionString)) {
                var adminDb = client.getDatabase("admin");
                adminDb.runCommand(new Document("replSetInitiate", new Document("_id", REPLICA_SET_NAME)
                    .append("members", members))
                );
            } catch (Exception e) {
                throw new RuntimeException("Failed to initialize MongoDB replica set", e);
            }
            // Sleep to ensure replica set is initialized
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize MongoDB replica set", e);
        }
    }

    public String getReplicaSetConnectionString() {
        return "mongodb://" + this.mongoNodes.stream()
            .map(container -> "localhost" + ":" + container.getMappedPort(MONGO_PORT))
            .collect(Collectors.joining(",")) + "/?replicaSet=" + REPLICA_SET_NAME;
    }
}
