package io.github.farrukhjon.experiment.akka.actor.composition.di;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;

public class ActorB extends AbstractLoggingActor {

  private final ActorRef actorARef;

  public ActorB(final ActorRef actorARef) {
    this.actorARef = actorARef;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, this::handleMessage)
        .build();
  }

  private void handleMessage(final String message) {
    log().info("Receiving message: {}", message);
    final ActorRef self = getSelf();
    final String actorBName = self.path().name();
    this.actorARef.tell(message + " was processed by " + actorBName, self);
  }

}
