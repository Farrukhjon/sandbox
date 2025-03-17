package io.github.farrukhjon.experiment.java.java.concurrency;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class App {

    private final ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> (100));

    public Integer getData() {
        return threadLocal.get();
    }

    public void setData(Integer data) {
        threadLocal.set(data);
    }

    private void cleanup() {
        this.threadLocal.remove(); // "ThreadLocal" variables should be cleaned up when no longer used
    }

    public static void main(String[] args) {

        Runnable calc = () -> {
            App app = new App();
            Integer data = app.getData();
            data++;
            app.setData(data);
            log.info("Thread name: {}, the value is: {}", Thread.currentThread().getName(), app.getData());
            app.cleanup();
        };

        new Thread(calc).start();
        new Thread(calc).start();
        new Thread(calc).start();

    }

}
