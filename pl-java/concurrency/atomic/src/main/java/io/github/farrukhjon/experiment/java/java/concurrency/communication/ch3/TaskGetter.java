package io.github.farrukhjon.experiment.java.java.concurrency.communication.ch3;

import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TaskGetter implements Runnable {

  private final Counter counter;

  public TaskGetter(Counter counter) {
    this.counter = counter;
  }

  @SuppressWarnings("java:S2189")
  @Override
  public void run() {
    synchronized (counter) {
      while (true) {
        int count = counter.getCount();
        log.info("Counter value has been got: {}", count);
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
    }
  }

}
