package io.github.farrukhjon.experiment.java.concurrency.collections.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrayBlockingQueueDemo {

  public static void main(String[] args) throws InterruptedException {

    final String[] strs = {"A", "B", "C", "D", "E"};

    final BlockingQueue<String> bq = new ArrayBlockingQueue<>(1024);

    Thread t1 = new Thread() {

      @Override
      public void run() {
        try {
          for (final String e : strs) {
            bq.put(e);
            log.info("put to blocking queue: " + e);
            Thread.sleep(3000);
          }
        } catch (InterruptedException e) {
          log.warn("Interrupted!", e);
          Thread.currentThread().interrupt();
        }
      }
    };

    Thread t2 = new Thread() {
      @Override
      public void run() {
        try {
          for (int i = 0; i < strs.length; i++) {
            final String value = bq.take();
            log.info("took value: " + value);
            Thread.sleep(3000);
          }
        } catch (InterruptedException e) {
          log.warn("Interrupted!", e);
          Thread.currentThread().interrupt();
        }
      }
    };

    t1.start();
    t2.start();

    Thread.sleep(5000);
  }

}
