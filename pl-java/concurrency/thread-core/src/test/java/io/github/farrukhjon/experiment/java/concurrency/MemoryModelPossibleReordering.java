package io.github.farrukhjon.experiment.java.concurrency;

import org.junit.jupiter.api.RepeatedTest;

public class MemoryModelPossibleReordering {

    int a = 0, x = 0;
    int b = 0, y = 0;

    @RepeatedTest(name = "possible reordering and unexpected result due to not synchronizing shared variables", value = 7)
    void possibleReorderingIsHappening() throws InterruptedException {
        Thread first = new Thread(() -> {
            a = 1;
            x = b;
        });
        Thread second = new Thread(() -> {
            b = 1;
            y = a;
        });
        first.start();
        second.start();
        first.join();
        second.join();

        System.out.println("( x = " + x + ", y = " + y + ")");
    }

    @RepeatedTest(name = "no reordering and expected result due to synchronizing shared variables", value = 7)
    void possibleReorderingIsNotHappening() throws InterruptedException {
        Thread first = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                a = 1;
                x = b;
            }
        });
        Thread second = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                b = 1;
                y = a;
            }
        });
        first.start();
        second.start();
        first.join();
        second.join();

        System.out.println("( x = " + x + ", y = " + y + ")");
    }
}
