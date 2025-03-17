package io.github.farrukhjon.experiment.java.atomic.action;

public class Incrementator implements Runnable {

    public static int count = 0;

    @Override
    public void run() {
        count ++;
    }

    public int getCount() {
        return count;
    }
}
