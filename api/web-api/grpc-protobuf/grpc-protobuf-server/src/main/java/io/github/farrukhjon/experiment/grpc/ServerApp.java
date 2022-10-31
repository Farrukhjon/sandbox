package io.github.farrukhjon.experiment.grpc;

import io.github.farrukhjon.experiment.grpc.protobuf.service.CommonConstants;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerApp {

  private static final Logger log = LoggerFactory.getLogger(ServerApp.class);

  private Server server;

  public static void main(String[] args) throws IOException, InterruptedException {
    final ServerApp serverApp = new ServerApp();
    serverApp.start();
    serverApp.blockUntilShutdown();
  }

  private void start() throws IOException {
    server = ServerBuilder
        .forPort(CommonConstants.SERVER_PORT)
        .addService(new GreetingServiceImpl())
        .build()
        .start();
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      try {
        stop();
      } catch (InterruptedException e) {
        log.error("Force stop due to: {}", e.getMessage());
        Thread.currentThread().interrupt();
      }
    }));
  }

  private void stop() throws InterruptedException {
    if (server != null) {
      server.shutdown().awaitTermination(10, TimeUnit.SECONDS);
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

}
