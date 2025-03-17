package io.github.farrukhjon.eventhub.service;

import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventHubConsumerAsyncClient;
import com.azure.messaging.eventhubs.EventHubProducerAsyncClient;
import com.azure.messaging.eventhubs.models.EventPosition;
import io.github.farrukhjon.eventhub.util.EventHubConnectionConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventHubPubSubService {

    private final EventHubProducerAsyncClient producer;

    private final EventHubConsumerAsyncClient consumer;

    private final List<String> receivedMessages = new CopyOnWriteArrayList<>();

    public EventHubPubSubService(final EventHubConnectionConfig config) {
        var eventHubClientBuilder = new EventHubClientBuilder();
        var connectionString = config.connectionString();
        var consumerGroup =
            config.consumerGroup().isPresent() ? config.consumerGroup().get() : EventHubClientBuilder.DEFAULT_CONSUMER_GROUP_NAME;
        this.producer = eventHubClientBuilder
            .connectionString(connectionString)
            .buildAsyncProducerClient();
        this.consumer = eventHubClientBuilder
            .connectionString(connectionString)
            .consumerGroup(consumerGroup)
            .buildAsyncConsumerClient();
    }

    public void sendMessage(String message) {
        var eventData = new EventData(message);
        this.producer.send(List.of(eventData)).block();
    }

    public void startListening() {
        this.consumer.receiveFromPartition("0", EventPosition.latest())
            .subscribe(event -> this.receivedMessages.add(event.getData().getBodyAsString()));
    }

    public List<String> getReceivedMessages() {
        return this.receivedMessages;
    }

    public void close() {
        this.producer.close();
        this.consumer.close();
    }
}

