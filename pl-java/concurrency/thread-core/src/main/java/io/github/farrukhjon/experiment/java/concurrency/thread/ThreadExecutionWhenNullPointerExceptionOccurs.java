

package io.github.farrukhjon.experiment.java.concurrency.thread;

public class ThreadExecutionWhenNullPointerExceptionOccurs {

    public static void main(String[] args) {
        String mainThreadName = Thread.currentThread().getName();
        System.out.println("Execution in the: " + mainThreadName);

        new Thread(() -> {
            while (true) {
                System.out.println("Execution in the: " + Thread.currentThread().getName());
            }
        }).start();

        throw new NullPointerException("Exception on: " + mainThreadName);
    }
}

