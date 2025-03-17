package io.github.farrukhjon.eventhub.util;

import java.util.Optional;

/**
 * @author fsattorov
 */
public record EventHubConnectionConfig(String connectionString, String eventhubName, Optional<String> consumerGroup) {

    public EventHubConnectionConfig(final String connectionString, final String eventHubName) {
        this(connectionString, eventHubName, Optional.empty());
    }
}
