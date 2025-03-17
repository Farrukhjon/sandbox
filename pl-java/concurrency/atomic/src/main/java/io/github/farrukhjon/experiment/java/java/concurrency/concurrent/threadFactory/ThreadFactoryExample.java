package io.github.farrukhjon.experiment.java.java.concurrency.concurrent.threadFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ThreadFactoryExample {

    public static void main(String[] args) {

        MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");
        Task task = new Task();

        Thread thread;
        System.out.printf("Starting the Threads\n");
        for (int i = 0; i < 10; i++) {
            thread = factory.newThread(task);
            thread.start();
        }

        System.out.printf("Factory stats:\n");
        System.out.printf("%s\n", factory.getStats());
    }

    public static class Task implements Runnable {

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static class MyThreadFactory implements ThreadFactory {

        private int counter;
        private String name;
        private List<String> stats;

        public MyThreadFactory(String name) {
            this.name = name;
            this.counter = 0;
            this.stats = new ArrayList<>();
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, name + "-Thread_" + counter);
            counter++;
            stats.add(String.format("Created thread %d with name %s on %s\n", t.getId(), t.getName(), new Date()));
            return t;
        }

        public String getStats() {
            StringBuffer buffer = new StringBuffer();
            Iterator<String> it = stats.iterator();
            while (it.hasNext()) {
                buffer.append(it.next());
                buffer.append("\n");
            }
            return buffer.toString();
        }

    }
}
