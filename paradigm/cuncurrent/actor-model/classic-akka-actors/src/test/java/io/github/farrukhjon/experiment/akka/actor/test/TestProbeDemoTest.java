package io.github.farrukhjon.experiment.akka.actor.test;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.testkit.TestProbe;
import org.junit.jupiter.api.Test;

/**
 * TestProbe:
 *  - TestKit-based probe which allows sending, reception and reply
 *  - is an object that contains a message queue to which messages can be sent via the corresponding ActorRef.
 */
class TestProbeDemoTest {

  ActorSystem system = ActorSystem.create();
  TestProbe testProbe = new TestProbe(system);


  @Test
  void testTestProbe() {
    ActorRef actorRefTestActor = testProbe.ref();
    String expectedMessage = "";
    testProbe.expectMsg(expectedMessage);
  }
}
