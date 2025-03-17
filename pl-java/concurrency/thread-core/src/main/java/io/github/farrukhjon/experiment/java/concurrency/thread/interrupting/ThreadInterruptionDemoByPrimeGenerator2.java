package io.github.farrukhjon.experiment.java.concurrency.thread.interrupting;

import java.util.concurrent.TimeUnit;

public class ThreadInterruptionDemoByPrimeGenerator2 extends Thread {

    @Override
    public void run() {
        long number = 1L;
        while (true) {
            if (isPrime(number))
                System.out.println("Number " + number + " is prime");
            if (this.isInterrupted()) {
                System.out.println("The Prime Generator has been interrupted");
                break;
            }
            number++;
        }
    }

    private boolean isPrime(long number) {
        if (number <= 2)
            return true;
        for (long i = 2; i < number; i++)
            if ((number % i) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ThreadInterruptionDemoByPrimeGenerator2();
        thread.start();
        TimeUnit.SECONDS.sleep(5);
        thread.interrupt();
    }
}
