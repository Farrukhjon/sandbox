package io.github.farrukhjon.experiment;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

    private static JettyServer jettyServer;

    @BeforeClass
    public static void beforeClass() throws Exception {
        jettyServer = new JettyServer();
        jettyServer.initWebServer();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        jettyServer.stopWebServer();
    }
}
