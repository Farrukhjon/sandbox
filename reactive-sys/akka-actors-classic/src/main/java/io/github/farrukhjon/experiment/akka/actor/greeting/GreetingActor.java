package io.github.farrukhjon.experiment.akka.actor.greeting;

import akka.actor.AbstractLoggingActor;

public final class GreetingActor extends AbstractLoggingActor {

  public static final String GREET = "Hello!";

  private GreetingActor() {
    log().info("Constructing...");
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("Hello", msg -> getSender().tell(msg + "World!", getSelf()))
        .match(Greeting.class,
            greeting -> log().info("Receiving message type: {} with message {}", Greeting.class.getCanonicalName(), greeting))
        .matchAny(o -> log().info("Receiving unknown message..."))
        .build();
  }

  @Override
  public void preStart() {
    log().info("preStart() is calling...");
  }

  @Override
  public void postStop() {
    log().info("postStop() is calling...");
  }

  public String sayHello() {
    return GREET;
  }
}
