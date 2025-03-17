

package io.github.farrukhjon.experiment.java.concurrency.thread;

public class ShutdownHookDemo {

    public static void main(String[] args) {

        System.out.println("Execution from: " + Thread.currentThread().getName());

        // The hook initialized but not started yet.
        Thread hook = new Thread() {
            @Override
            public void run() {
                System.out.println("Execution from the shutdown hook");
            }
        };

        Runtime.getRuntime().addShutdownHook(hook);


        Thread.State state = hook.getState();
        System.out.println(state);

        //System.exit(0);
    }

}
