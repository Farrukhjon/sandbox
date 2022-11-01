package io.github.farrukhjon.experiment.akka.actor.lifecycle.stop;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;
import java.util.Set;

public class StopActorByStopMethodDemo {

  public static void main(String[] args) {

    ActorSystem system = ActorSystem.create();
    ActorRef actorRef = system.actorOf(Props.create(StopableActor.class));
    Set.of("One", "Two", "Three", "Done", "This", "and this", "go to DeadLetter")
        .forEach( msg -> actorRef.tell(msg, ActorRef.noSender()));
    system.terminate();
  }

  static class StopableActor extends AbstractLoggingActor {

    @Override
    public Receive createReceive() {
      return ReceiveBuilder
          .create()
          .matchEquals("Done", msg -> getContext().stop(getSelf()))
          .matchAny(msg -> log().info("Processing {}", msg))
          .build();
    }

    @Override
    public void postStop() {
      log().info("Stopped");
    }
  }
}
