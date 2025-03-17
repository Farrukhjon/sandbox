package io.github.farrukhjon.experiment.java.java.concurrency.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AtomicReferenceFieldUpdaterExample {

    private static class Book {

        private String name;

        public Book(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * @author shaines
     */

    private static class MyObject {

        @SuppressWarnings("java:S3077")
        private volatile Book whatImReading;

        private static final AtomicReferenceFieldUpdater<MyObject, Book> updater = AtomicReferenceFieldUpdater.newUpdater(MyObject.class, Book.class, "whatImReading");

        public Book getWhatImReading() {
            return whatImReading;
        }

        public void setWhatImReading(Book whatImReading) {
            // this.whatImReading = whatImReading;
            updater.compareAndSet(this, this.whatImReading, whatImReading);
        }
    }

    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.setWhatImReading(new Book("Java 2 From Scratch"));
        obj.setWhatImReading(new Book("Pro Java EE 5 Performance Management and Optimization"));

        final String name = obj.getWhatImReading().getName();
        log.info(name);
    }

}
