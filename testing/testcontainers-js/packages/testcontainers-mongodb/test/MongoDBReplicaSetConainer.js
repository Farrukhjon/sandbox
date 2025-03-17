require('dotenv').config({
    path: ['./.env', '../../.env'],
});
const {GenericContainer, Network, Wait} = require("testcontainers");
const {MongoClient} = require("mongodb");

class MongoDBReplicaSet {
    constructor(dbName, nodeCount = 3) {
        this.dbName = dbName;
        this.nodeCount = nodeCount;
        this.containers = [];
        this.connections = [];
        this.dbInstances = [];
        this.replicaSetUri = null;
        this.mongoImage = process.env.MONGO_IMAGE || "mongo:8.0.4";
        this.port = 27017;
    }

    async start() {
        if (!this.network) {
            this.network = await new Network().start();
        }
        for (let i = 0; i < this.nodeCount; i++) {
            const container = await new GenericContainer(this.mongoImage)
                .withExposedPorts(this.port)
                .withNetwork(this.network)
                .withNetworkAliases(`mongo-${i}`)
                .withEnvironment({
                    "MONGO_INITDB_DATABASE": this.dbName
                })
                .withCommand(["--replSet", "rs0", "--storageEngine", "wiredTiger"])
                .withWaitStrategy(Wait.forLogMessage(/.*waiting for connections.*/i))
                .withStartupTimeout(120000)
                .withLogConsumer((stream) => {
                    stream.on('data', (line) => console.log(line));
                    stream.on('err', (line) => console.error(line));
                    stream.on('end', () => console.log('Stream closed'));
                })
                .start();
            this.containers.push(container);
        }

        const hosts = this.containers.map(
            (container) => {
                return `${container.getHostname()}:${container.getMappedPort(this.port)}`;
            }
        );
        const primaryContainer = this.containers[0];

        let members = `${hosts.map((host, index) => `{ _id: ${index}, host: '${host}' }`).join(",")}`;
        await primaryContainer.exec(["mongosh", "--eval", `rs.initiate({_id: 'rs0', members: [${members}]})`]);
        this.replicaSetUri = `mongodb://${hosts.join(",")}/?replicaSet=rs0`;
    }

    getReplicaSetUri() {
        return this.replicaSetUri;
    }

    async stop() {
        for (const connection of this.connections) {
            await connection.close();
        }
        for (const container of this.containers) {
            await container.stop();
        }
        if (this.network) {
            await this.network.stop();
        }
    }
}

module.exports = MongoDBReplicaSet;
