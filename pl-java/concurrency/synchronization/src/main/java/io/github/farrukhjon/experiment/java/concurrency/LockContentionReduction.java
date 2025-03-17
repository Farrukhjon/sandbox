package io.github.farrukhjon.experiment.java.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LockContentionReduction {

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new LockContentionIssueTask(data));
            thread.start();
            threads.add(thread);
        }
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new LockContentionReducedTask(data));
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
        for (String datum : data) {
            System.out.printf("data: %s \t", datum);
        }
    }

    private static class LockContentionIssueTask implements Runnable {
        private List<String> data;

        public LockContentionIssueTask(List<String> data) {
            this.data = data;
        }

        @Override
        public synchronized void run() {
            String id = computeId(); // this local value/methods can be extracted from synchronized to reduce lock contention
            data.add(id);
        }
    }

    private static class LockContentionReducedTask implements Runnable {
        private List<String> data;

        public LockContentionReducedTask(List<String> data) {
            this.data = data;
        }

        @Override
        public void run() {
            String id = computeId(); // this local value/methods is extracted from synchronized to reduce lock contention
            synchronized (this) {
                data.add(id);
            }
        }
    }

    private static String computeId() {
        return UUID.randomUUID().toString();
    }

}
