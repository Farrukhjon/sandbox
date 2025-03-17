package io.github.farrukhjon.experiment.java.concurrency.concurrent.collections.map;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapTest {

    @RepeatedTest(name = "write and read to/from ConcurrentHashMap simultaneously from multiple threads", value = 3)
    public void testCreateConcurrentHashMap() throws InterruptedException {
        ConcurrentHashMap<Integer, String> storage = new ConcurrentHashMap<>();
        int nThreads = 3;
        ExecutorService es = Executors.newFixedThreadPool(nThreads);
        for (int id = 0; id < nThreads; id++) {
            es.execute(new WriteTask(storage, id));
            //es.execute(new RemoveTask(storage, id));
            es.execute(new ReadTask(storage, id));
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
    }

    static class WriteTask implements Runnable {
        private final ConcurrentHashMap<Integer, String> storage;
        private final int id;

        WriteTask(ConcurrentHashMap<Integer, String> storage, int id) {
            this.storage = storage;
            this.id = id;
        }

        @Override
        public void run() {
            int rndNumber = new Random().ints().findAny().getAsInt();
            String strRnd = String.valueOf(rndNumber);
            storage.put(id, strRnd);
            System.out.printf("Writer: key/value: [%s/%s] is written by [%s] \n", id, strRnd, Thread.currentThread().getName());
        }
    }

    static class ReadTask implements Runnable {
        private final ConcurrentHashMap<Integer, String> storage;
        private final int id;

        ReadTask(ConcurrentHashMap<Integer, String> storage, int id) {
            this.storage = storage;
            this.id = id;
        }

        @Override
        public void run() {
            String strRnd = storage.get(id);
            System.out.printf("Reader: key/value: %s/%s read by %s \n", id, strRnd, Thread.currentThread().getName());
        }
    }

    static class RemoveTask implements Runnable {
        private final ConcurrentHashMap<Integer, String> storage;
        private final int id;

        RemoveTask(ConcurrentHashMap<Integer, String> storage, int id) {
            this.storage = storage;
            this.id = id;
        }

        @Override
        public void run() {
            String strRnd = storage.remove(id);
            System.out.printf("Remover: key/value: %s/%s removed by %s \n", id, strRnd, Thread.currentThread().getName());
        }
    }

}
