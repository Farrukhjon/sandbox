package io.github.farrukhjon.experiment.java.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitWhenAllTasksDoneWithCompletableFuture {

  public static void main(String[] args) {

    List<Runnable> allTasks = createTasksList();
    ExecutorService executor = Executors.newFixedThreadPool(allTasks.size());
    CompletableFuture<?>[] completableFutures = allTasks
        .stream()
        .map(aTask -> CompletableFuture.runAsync(aTask, executor))
        .toArray(CompletableFuture[]::new);
    CompletableFuture
        .allOf(completableFutures)
        .join();
    executor.shutdown();
  }

  private static List<Runnable> createTasksList() {
    final Runnable task1 = createATask("Performing task1...");
    final Runnable task2 = createATask("Performing task2...");
    final Runnable task3 = createATask("Performing task3...");
    return Arrays.asList(task1, task2, task3);
  }

  private static Runnable createATask(String taskDescription) {
    return () -> {
      try {
        System.out.println(taskDescription);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(taskDescription + " is done!");
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    };
  }

}
