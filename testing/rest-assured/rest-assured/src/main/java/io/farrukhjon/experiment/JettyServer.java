package io.github.farrukhjon.experiment;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import io.github.farrukhjon.experiment.rest.TestServlet;

public class JettyServer {

    private static Server server;
    private static int port = 8080;

    public void initWebServer() throws Exception {
        server = new Server(port);
        ServerConnector serverConnector = new ServerConnector(server);
        server.addConnector(serverConnector);
        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.setContextPath("/");
        ServletHolder servletHolder = contextHandler.addServlet(TestServlet.class, "/test/*");
        servletHolder.setInitParameter("", "");
        server.setHandler(contextHandler);
        server.start();
    }

    public void stopWebServer() throws Exception {
        server.stop();
        server.join();
    }
}
