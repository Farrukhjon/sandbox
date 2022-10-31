package io.github.farrukhjon.experiment.akka.actor.composition.di;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;

public class ActorA extends AbstractLoggingActor {

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, this::handleMessage)
        .build();
  }

  private void handleMessage(final String message) {
    final ActorRef actorBRef = getSender();
    log().info("Receiving message: {}", message + actorBRef.toString());
  }

}
