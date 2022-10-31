package io.github.farrukhjon.experiment.akka.actor.greeting;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class GreetingActorDemo {

  public static void main(String[] args) {
    ActorSystem actorSystem = ActorSystem.create("GreetingActorSystem");
    ActorRef greetingActorRef = actorSystem.actorOf(Props.create(GreetingActor.class), "GreetingActor");
    greetingActorRef.tell(new Greeting("Hello Actor"), ActorRef.noSender());
  }

}
