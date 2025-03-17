package io.github.farrukhjon.experiment.java.java.concurrency.thread_pool;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;

public class CustomThreadPool {

    private final Queue<Runnable> queue = new ConcurrentLinkedQueue<>();
    private volatile boolean isRunning = true;

    public CustomThreadPool(int poolSize) {
        for (int i = 1; i <= poolSize; i++) {
            Thread newThread = Executors
                    .defaultThreadFactory()
                    .newThread(new WorkerTask());
            //newThread.setName("CustomThreadPool-" + i);
            newThread.start();

        }
    }

    public void submit(Runnable task) {
        if (isRunning) {
            queue.offer(task);
        }
    }

    private class WorkerTask implements Runnable {
        @Override
        public void run() {
            while (isRunning) {
                Runnable task = queue.poll();
                if (task != null) {
                    task.run();
                }
            }
        }
    }

    public void shutdown() {
        this.isRunning = false;
    }
}
