package io.github.farrukhjon.experiment.java.java.concurrency;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import io.github.farrukhjon.experiment.java.java.concurrency.synchronization.Counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {

  @Test
  void shouldTestIncrementCounter() throws InterruptedException {
    Counter sut = new Counter();
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    for (int i = 0; i < 10; i++) {
      executorService.execute(sut::increment);
    }

    executorService.awaitTermination(2, TimeUnit.SECONDS);
    executorService.shutdown();

    int count = sut.getCount();
    assertEquals(10, count);
  }
}
