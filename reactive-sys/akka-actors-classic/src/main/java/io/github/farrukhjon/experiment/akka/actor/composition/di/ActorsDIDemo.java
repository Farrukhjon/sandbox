package io.github.farrukhjon.experiment.akka.actor.composition.di;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class ActorsDIDemo {

  public static void main(String[] args) {

    ActorSystem system = ActorSystem.create();

    final ActorRef actorARef = system.actorOf(Props.create(ActorA.class), "ActorA");

    final ActorRef actorBRef = system.actorOf(Props.create(ActorB.class, actorARef), "ActorB");

    actorBRef.tell("Some Message for ActorB", ActorRef.noSender());


  }

}
