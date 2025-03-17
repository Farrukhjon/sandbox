package io.github.farrukhjon.experiment.java.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {

    private static AtomicBoolean anyRead = new AtomicBoolean(false);

    public static void main(String[] args) throws InterruptedException {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F");

        ReadWriteLock rwLock = new ReentrantReadWriteLock();
        Thread[] readersAndWriters = new Thread[7];
        for (int i = 0; i < 7; i++) {
            readersAndWriters[i] = new Thread(() -> {
                rwLock.readLock().lock();
                try {
                    for (String str : list) {
                        System.out.printf("Thread: %s has read [%s] \n", Thread.currentThread().getName(), str);
                        anyRead.set(true);
                    }
                    if (anyRead.get()) {
                        rwLock.readLock().unlock();
                        rwLock.writeLock().lock();
                        try {
                            String newValue = "X";
                            list.add(newValue);
                            System.out.printf("Thread: %s has written [%s]\n", Thread.currentThread().getName(), newValue);
                            anyRead.set(false);
                        } finally {
                            rwLock.writeLock().unlock();
                        }
                    }
                } finally {
                    rwLock.readLock().unlock();
                    rwLock.writeLock().unlock();
                }
            });
            readersAndWriters[i].start();
        }
        for (Thread t : readersAndWriters) {
            t.join();
        }
    }
}


