package io.github.farrukhjon.experiment.akka.actor.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.pattern.Patterns;
import akka.testkit.TestActorRef;
import io.github.farrukhjon.experiment.akka.actor.greeting.GreetingActor;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Synchronous Testing Actors (Syngle threaded) with TestActorRef
 * TestActorRef
 *     - is exclusively for use during unit testing in a single-threaded environment
 *     - overwrites:
 *        - the dispatcher to CallingThreadDispatcher.global
 *        - the receiveTimeout to None
 */
class TestActorRefDemoTest {

  /**
   * Create TestActorRef to test GreetingActor actor.
   */
  TestActorRef<GreetingActor> testActorRef = TestActorRef.create(
      ActorSystem.create("TestActorSystem"),
      Props.create(GreetingActor.class),
      "greetingActor"
  );

  @Test
  @DisplayName("test a public method of an actual actor with TestActorRef")
  void testAPublicMethodOfAnActualActor() {
    //given:
    GreetingActor greetingActor = testActorRef.underlyingActor();
    //when:
    String result = greetingActor.sayHello();

    //then:
    assertEquals("Hello!", result);
  }

  @Test
  @DisplayName("test the createReceive() method of an actor with TestActorRef")
  void testTheReceiveMethodOfAnActualActor() throws ExecutionException, InterruptedException {
    //given:
    String greeting = "Hello";

    //when:
    CompletableFuture<Object> future =
        Patterns.ask(testActorRef, greeting, Duration.ofMillis(3000))
            .toCompletableFuture();
    //and:
    String expectedReplyMsgFromActor = greeting + "World!";

    //then:
    assertTrue(future.isDone());
    assertEquals(expectedReplyMsgFromActor, future.get());
  }

}
