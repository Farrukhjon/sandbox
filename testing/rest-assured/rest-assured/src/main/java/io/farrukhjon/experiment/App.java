package io.github.farrukhjon.experiment;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        JettyServer jettyServer = new JettyServer();
        jettyServer.initWebServer();
    }
}
