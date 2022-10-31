package io.github.farrukhjon.experiment.akka.actor.thread_safe;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;
import java.util.stream.IntStream;

public class CounterAkkaActorApp {

  static class Counter extends AbstractLoggingActor {

    @SuppressWarnings("java:S1700")
    private int counter = 0;

    //protocol
    static class CounterMessage {
    }

    @Override
    public Receive createReceive() {
      return ReceiveBuilder
          .create()
          .match(CounterMessage.class, this::handleMessage)
          .build();
    }

    private void handleMessage(CounterMessage message) {
      counter++; // safely incremented mutable state - "counter" field within the "Counter" actor
      log().info("Incremented counter: {}", counter);
    }

    public static Props props() {
      return Props.create(Counter.class);
    }

  }

  public static void main(String[] args) {
    ActorSystem system = ActorSystem.create();
    ActorRef counter = system.actorOf(Counter.props(), "counter");
    IntStream.range(0, 10).forEach(i -> {
          final Runnable task = () -> counter.tell(new Counter.CounterMessage(), ActorRef.noSender());
          new Thread(task).start();
          //ActorRef.noSender() - we do not pass any sender, at least, since it's sent from main method
        }
    );
  }

}
