package io.github.farrukhjon.experiment.grpc;

import io.github.farrukhjon.experiment.grpc.protobuf.domain.GreetingRequest;
import io.github.farrukhjon.experiment.grpc.protobuf.domain.GreetingResponse;
import io.github.farrukhjon.experiment.grpc.protobuf.service.CommonConstants;
import io.github.farrukhjon.experiment.grpc.protobuf.service.GreeterGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class ClientApp {

  private static final Logger log = LoggerFactory.getLogger(ClientApp.class);

  public static void main(String[] args) {
    final Channel channel = ManagedChannelBuilder
        .forAddress("localhost", CommonConstants.SERVER_PORT)
        .usePlaintext()
        .build();
    final GreeterGrpc.GreeterBlockingStub blockingStub = GreeterGrpc.newBlockingStub(channel);
    final GreetingRequest request = GreetingRequest.newBuilder()
        .setHello("Hello!")
        .build();
    log.info("Requesting server: {}", request);
    final GreetingResponse response = blockingStub.greet(request);
    log.info("Receiving response: {}", response);
  }
}
