package io.github.farrukhjon.experiment.java.concurrency.collections.list;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CopyOnWriteArrayListDemo {

    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        final CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();

        Runnable outFromT1 = () -> {
            while (true) {
                try {
                    int increment = counter.getAndIncrement();
                    cowList.add(increment);
                    System.out.println(increment + " added to cowList by t1");
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("out from t1");
                    return;
                }
            }
        };
        Thread t1 = new Thread(outFromT1);
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(() -> {
            while (true) {
                try {
                    int increment = counter.getAndIncrement();
                    cowList.add(increment);
                    System.out.println(increment + " added to cowList by t2");
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("out from t1");
                    return;
                }
            }
        });
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        try {
            TimeUnit.SECONDS.sleep(5);
            t1.interrupt();
            t2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(cowList);

    }
}
