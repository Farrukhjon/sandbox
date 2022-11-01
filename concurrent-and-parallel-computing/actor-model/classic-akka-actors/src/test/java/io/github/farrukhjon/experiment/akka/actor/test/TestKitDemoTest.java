package io.github.farrukhjon.experiment.akka.actor.test;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.javadsl.TestKit;
import io.github.farrukhjon.experiment.akka.actor.greeting.GreetingActor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 */
class TestKitDemoTest {

  static ActorSystem system;
  static TestKit testKit;

  @BeforeAll
  static void setUp() {
    system = ActorSystem.create("TestActorSystem");
    testKit = new TestKit(system); // ActorSystem passed to the constructor of TestKit is accessible via the getSystem() method.
  }

  /**
   * Shut down the actor system after the test is finished (also in case of failure) so that all actors—including the test actor—are
   * stopped.
   */
  @AfterAll
  static void tearDown() {
    TestKit.shutdownActorSystem(system); //or TestKit.shutdownActorSystem(testKit.getSystem())
    system = null;
  }


  @Test
  @DisplayName("test the createReceive() method of an actor with TestKit")
  void testTheReceiveMethodOfAnActualActor() {
    //given:
    String greeting = "Hello";

    //when:
    ActorRef actorRefGreetingActor = system.actorOf(Props.create(GreetingActor.class));
    actorRefGreetingActor.tell("Hello", testKit.getRef());

    //and:
    String expectedReplyMsgFromActor = greeting + "World!";

    //then:
    testKit.expectMsgEquals(expectedReplyMsgFromActor);
    testKit.expectNoMessage();
  }

}
