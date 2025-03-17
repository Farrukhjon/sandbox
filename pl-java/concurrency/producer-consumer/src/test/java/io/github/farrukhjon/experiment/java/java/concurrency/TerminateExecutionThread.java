

package io.github.farrukhjon.experiment.java.java.concurrency;

import java.util.concurrent.TimeUnit;

public class TerminateExecutionThread {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Thread currentThread = Thread.currentThread();
            while (!currentThread.isInterrupted()) {
                System.out.println(currentThread.getName() + " Execution...");
            }
        });
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(thread.getName() + " is " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
