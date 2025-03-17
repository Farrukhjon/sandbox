package io.github.farrukhjon.experiment.java.concurrency.thread.interrupting;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskCancellationRequestByFlag {

    static class Task implements Runnable {
        private volatile boolean isCancelled; // must be volatile

        @Override
        public void run() {
            while (!isCancelled) { // the Task should check isCancelled Periodically
                System.out.printf("Computation is happening by thread: %s\n", Thread.currentThread().getName());
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    System.err.println("Task has been interrupted!");
                }
            }
        }

        public void chancelTask() { // the method gives ability to cancel the Task from outside by request.
            this.isCancelled = true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        for (int i = 0; i < 7; i++) {
            new Thread(task).start();
        }
        TimeUnit.SECONDS.sleep(3);
        task.chancelTask();
    }

}
