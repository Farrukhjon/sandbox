package io.github.farrukhjon.experiment.java.concurrency;

import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;

/**
 * One Writer thread and many reader threads operating over volatile data.
 * Volatile doesn't guarantee operation atomicity but guarantees proper/fresh data visibility for all threads.
 */
@SuppressWarnings("java:S2189")
@Slf4j
public class VolatileUseCaseDemo {

  static volatile int count;

  public static void main(String[] args) {

    Counter counter = new Counter();

    Thread threadWriter = new Thread(counter);
    threadWriter.start();

    Thread tPrinter1 = new Thread(new Printer());
    Thread tPrinter2 = new Thread(new Printer());
    Thread tPrinter3 = new Thread(new Printer());
    tPrinter1.start();
    tPrinter2.start();
    tPrinter3.start();

  }

  private static class Counter implements Runnable {

    @SuppressWarnings("java:S3078")
    private static void increment() {

      count++;
      log.info(Thread.currentThread().getName() + " writes: {} ", count);
    }

    @Override
    public void run() {
      while (true) {
        try {
          increment();
          TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
          log.warn("Interrupted!", e);
          Thread.currentThread().interrupt();
        }
      }
    }

  }

  private static class Printer implements Runnable {

    private void print() {
      log.info(Thread.currentThread().getName() + " reads: {}", count);
    }

    @Override
    public void run() {
      while (true) {
        try {
          print();
          TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
          log.warn("Interrupted!", e);
          Thread.currentThread().interrupt();
        }
      }
    }

  }

}
