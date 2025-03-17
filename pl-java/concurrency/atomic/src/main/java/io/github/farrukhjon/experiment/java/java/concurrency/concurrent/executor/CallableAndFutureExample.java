package io.github.farrukhjon.experiment.java.java.concurrency.concurrent.executor;

import java.util.concurrent.*;

/**
 * Created by Farrukhjon on 17-Sep-15.
 */
public class CallableAndFutureExample {

    static Callable<String> taskGetString = () -> {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello world!";
    };

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> computationResult = executor.submit(taskGetString);
        System.out.println("Is future (computation) done? " + computationResult.isDone());

        try {
            String result = computationResult.get();
            System.out.println("Is future (computation) done? " + computationResult.isDone());
            System.out.println("The result is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();

    }
}
