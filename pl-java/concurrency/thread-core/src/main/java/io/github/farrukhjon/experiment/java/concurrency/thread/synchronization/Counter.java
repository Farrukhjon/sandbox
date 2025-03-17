package io.github.farrukhjon.experiment.java.concurrency.thread.synchronization;

public class Counter {

    private int count;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public synchronized int getCount() {
        return count;
    }

}
