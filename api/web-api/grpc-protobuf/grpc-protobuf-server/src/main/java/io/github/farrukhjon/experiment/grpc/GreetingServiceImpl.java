package io.github.farrukhjon.experiment.grpc;

import io.github.farrukhjon.experiment.grpc.protobuf.domain.Greeting;
import io.github.farrukhjon.experiment.grpc.protobuf.domain.GreetingRequest;
import io.github.farrukhjon.experiment.grpc.protobuf.domain.GreetingResponse;
import io.github.farrukhjon.experiment.grpc.protobuf.service.GreeterGrpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingServiceImpl extends GreeterGrpc.GreeterImplBase {

  private static final Logger log = LoggerFactory.getLogger(GreetingServiceImpl.class);

  @Override
  public void greet(final GreetingRequest request, final StreamObserver<GreetingResponse> responseObserver) {
    final String requestMsg = request.getHello();
    log.info("Processing request: {}", requestMsg);
    if ("Hello!".equals(requestMsg)) {
      final String responseMsg = requestMsg + "World!";
      final GreetingResponse response = GreetingResponse.newBuilder()
          .setGreeting(Greeting.newBuilder()
              .setMsg(responseMsg)
              .build())
          .build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
  }

}
