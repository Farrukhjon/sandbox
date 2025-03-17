package io.github.farrukhjon.experiment.java.java.concurrency;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ForkJoinExamples {

    @Test
    public void testFileDownloaderFromWeb() throws URISyntaxException, IOException {
        URL url = new URL("https://docs.oracle.com/javase/tutorial/essential/concurrency/highlevel.html");
        InputStream inputStream = url.openStream();

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        assertNotNull(inputStream);
        assertNotNull(url);
    }

}
