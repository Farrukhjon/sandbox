package io.github.farrukhjon.experiment.java.recursion;

public class RecursiveCounter {

    public static void main(String[] args) {
        countDown(1024);
    }

    private static void countDown(int count) {
        if (count != -1) {
            System.out.println(" [" + count + "]");
            countDown(--count);
        }
    }
}
