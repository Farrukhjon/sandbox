package io.github.farrukhjon.experiment.java.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author fsattorov
 */
public class AsyncCooking {

  public static void main(String[] args) {

    final Runnable task1 = () -> {
      System.out.println("Prepare a pan");
      waitFor(3);
    };
    final Runnable task2 = () -> {
      System.out.println("Pour the oil");
      waitFor(4);
    };
    final Runnable task3 = () -> {
      System.out.println("Prepare a teapot");
      waitFor(4);
    };
    final Runnable task4 = () -> {
      System.out.println("Boil the water");
      waitFor(5);
    };

    final CompletableFuture<Void> future = CompletableFuture
        .runAsync(task1).thenRun(task2)
        .thenRunAsync(task3).thenRun(task4);

    System.out.printf("%s: Async cooking tasks have been submitted!%n", Thread.currentThread().getName());

    future.join();
  }

  private static void waitFor(int seconds) {
    try {
      System.out.printf("%s: Waiting for %s seconds ...%n", Thread.currentThread().getName(), seconds);
      TimeUnit.SECONDS.sleep(seconds);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
