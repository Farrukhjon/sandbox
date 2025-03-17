package io.github.farrukhjon.experiment.java.java.concurrency.atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic {

    private final AtomicInteger atomicInteger = new AtomicInteger();

    public int incrementNumber() {
        return atomicInteger.getAndIncrement();
    }

    public int getNumber() {
        return atomicInteger.get();
    }

}
