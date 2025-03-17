package io.github.farrukhjon.experiment.java.java.concurrency.thread_pool;

public class CustomThreadPoolDemo {

    public static void main(String[] args) {
        int poolSize = 3;
        CustomThreadPool customThreadPool = new CustomThreadPool(poolSize);

        for (int i = 0; i < 1000; i++) {
            customThreadPool.submit(() -> {
                System.out.printf("This task is running by: %s\n", Thread.currentThread().getName());
            });
        }
        customThreadPool.shutdown();
    }

}
