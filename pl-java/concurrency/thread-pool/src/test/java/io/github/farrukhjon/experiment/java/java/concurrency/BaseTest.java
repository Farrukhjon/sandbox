package io.github.farrukhjon.experiment.java.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static final int MAX_TIME_TO_WAIT = 60;

    final protected void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(MAX_TIME_TO_WAIT, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Termination interrupted!");
        } finally {
            if (!executor.isTerminated()) {
                System.out.println("Killing non-finished tasks");
                executor.shutdownNow();
            }
        }
    }

    final protected void executeTimes(final ExecutorService executor, final Runnable task, final int times) {
        for (int i = 0; i < times; i++) {
            executor.execute(task);
        }
    }

}
