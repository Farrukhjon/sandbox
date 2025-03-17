package io.github.farrukhjon.experiment.java.java.concurrency;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.farrukhjon.experiment.java.java.concurrency.synchronization.Counter;
import org.junit.jupiter.api.Test;

class CounterTest {

  Thread[] threads = new Thread[10];

  @Test
  void shouldTestIncrementCounter() throws InterruptedException {
    Counter counter = new Counter();
    for (int i = 0; i < 10; i++) {
      threads[i] = new Thread(counter::increment);
    }
    for (Thread t : threads) {
      t.start();
    }
    for (Thread t : threads) {
      t.join();
    }

    int count = counter.getCount();
    assertEquals(10, count);
  }
}
