package io.github.farrukhjon.eventhub.util;

import io.github.cdimascio.dotenv.Dotenv;

/**
 * @author fsattorov
 */
public class EventhubConfigProvider {

    /**
     * We want to use the .env from the root directory in order to simplify setup for developers.
     *
     * @return {@link Dotenv}.
     */
    public static Dotenv dotenv() {
        return dotenv("../..");
    }

    public static Dotenv dotenv(final String path) {
        return Dotenv.configure()
            //.directory(path)
            .load();
    }

    public static String getEventHubConnectionString() {
        return dotenv().get("EVENTHUB_CONNECTION_STRING");
    }

    public static String getEventHubName() {
        return dotenv().get("EVENTHUB_NAME");
    }

    public static String getConsumerGroup() {
        return dotenv().get("EVENTHUB_CONSUMER_GROUP");
    }
}
