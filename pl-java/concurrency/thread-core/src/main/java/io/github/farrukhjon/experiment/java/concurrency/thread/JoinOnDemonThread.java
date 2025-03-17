package io.github.farrukhjon.experiment.java.concurrency.thread;

import java.util.concurrent.TimeUnit;

public class JoinOnDemonThread {

    public static void main(String[] args) throws InterruptedException {
        Thread aSleepingDemonThread = new Thread(new SleepingDemonTgread());
        aSleepingDemonThread.setDaemon(true); // make the thread a daemon thread
        aSleepingDemonThread.start();
        aSleepingDemonThread.join(); //if comment this then below isAlive() returns true value.
        System.out.println("Is a sleeping demon thread alive: " + aSleepingDemonThread.isAlive());
    }

    private static class SleepingDemonTgread implements Runnable {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.err.printf("The thread %s has been interrupted!", Thread.currentThread().getName());
            }
        }
    }
}
