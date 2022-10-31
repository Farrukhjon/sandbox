package io.github.farrukhjon.experiment.akka.actor.greeting;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class GreetingActor2 extends AbstractActor {

  private final LoggingAdapter loggingAdapter = Logging.getLogger(getContext().getSystem(), this);

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(Greeting.class,
            greeting -> loggingAdapter.info("Receiving message type: {} with message {}", Greeting.class.getCanonicalName(), greeting))
        .matchAny(o -> loggingAdapter.info("Receiving unknown message..."))
        .build();
  }

  @Override
  public void preStart() {
    loggingAdapter.info("preStart() is calling...");

  }

  @Override
  public void postStop() {
    loggingAdapter.info("postStop() is calling...");
  }

}
