package io.github.farrukhjon.experiment.akka.actor.test;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import io.github.farrukhjon.experiment.akka.actor.greeting.Greeting;
import io.github.farrukhjon.experiment.akka.actor.greeting.GreetingActor;

public class EventBusDemo {

  public static void main(String[] args) {
    final ActorSystem system = ActorSystem.create("ServerEvents");
    final ActorRef actor = system.actorOf(Props.create(GreetingActor.class));

    system.getEventStream().subscribe(actor, Greeting.class);
    system.getEventStream().publish(new Greeting("Hello, EventBus!"));
  }

}
