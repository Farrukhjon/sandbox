package io.github.farrukhjon.experiment.akka.actor.greeting;

public class Greeting {

  @SuppressWarnings("java:S1700")
  private final String greeting;

  public Greeting(String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting;
  }

  @Override
  public String toString() {
    return "Greeting{" +
        "greeting='" + greeting + '\'' +
        '}';
  }

}
