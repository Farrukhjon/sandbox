package io.github.farrukhjon.experiment.akka.actor.supervision;

import akka.actor.AbstractActor;
import akka.actor.AbstractLoggingActor;
import akka.actor.OneForOneStrategy;
import akka.actor.Props;
import akka.actor.SupervisorStrategy;
import akka.japi.pf.DeciderBuilder;
import java.time.Duration;

public class SimpleSupervisionActorApp {

  private SimpleSupervisionActorApp(){}

  static class SimpleSupervisionActor extends AbstractLoggingActor {

    private final SupervisorStrategy supervisorStrategy = new OneForOneStrategy(
        10,
        Duration.ofMillis(1),
        DeciderBuilder
            .match(ArithmeticException.class, e -> (SupervisorStrategy.Directive) SupervisorStrategy.resume())
            .match(NullPointerException.class, e -> (SupervisorStrategy.Directive) SupervisorStrategy.restart())
            .match(IllegalArgumentException.class, e -> (SupervisorStrategy.Directive) SupervisorStrategy.stop())
            .matchAny(o -> (SupervisorStrategy.Directive) SupervisorStrategy.escalate())
            .build());

    @Override
    public Receive createReceive() {
      return receiveBuilder()
          .match(
              Props.class,
              props -> getSender().tell(getContext().actorOf(props), getSelf()))
          .build();
    }

    @Override
    public SupervisorStrategy supervisorStrategy() {
      return this.supervisorStrategy;
    }
  }

  static class Child extends AbstractActor {

    int state = 0;

    @Override
    public Receive createReceive() {
      return receiveBuilder()
          .match(
              Exception.class,
              exception -> {
                throw exception;
              })
          .match(Integer.class, i -> state = i)
          .matchEquals("get", s -> getSender().tell(state, getSelf()))
          .build();
    }
  }

}
