package io.github.farrukhjon.experiment.java.concurrency.thread;

public class DemonThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread demonThread = new Thread(new LongRunningTask());
        demonThread.setDaemon(true); // make the thread a daemon thread
        demonThread.start();
        System.out.println("Is the demon thread " + demonThread.getName() + " alive: " + demonThread.isAlive());
    }

    private static class LongRunningTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("The daemon thread" + Thread.currentThread().getName() + " is working!");
            }
        }
    }
}
