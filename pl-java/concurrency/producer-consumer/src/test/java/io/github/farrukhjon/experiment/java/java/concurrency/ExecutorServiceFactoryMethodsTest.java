package io.github.farrukhjon.experiment.java.java.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorServiceFactoryMethodsTest extends BaseTest {

  Runnable printThreadNameTask = () -> {
    String name = Thread.currentThread().getName();
    System.out.println("Name of the running thread: " + name);
  };

  @Test
  void testSingleThreadExecutor() {
    ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    executeTimes(singleThreadExecutor, printThreadNameTask, 10);
    stop(singleThreadExecutor);
  }

  @Test
  void testFixedThreadExecutor() {
    ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(7);
    executeTimes(fixedThreadExecutor, printThreadNameTask, 7);
    stop(fixedThreadExecutor);
  }

  @Test
  void testCachedThreadExecutor() {
    ExecutorService cachedThreadExecutor = Executors.newCachedThreadPool();
    executeTimes(cachedThreadExecutor, printThreadNameTask, 7);
    stop(cachedThreadExecutor);
  }

}
