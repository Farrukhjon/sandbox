package io.github.farrukhjon.experiment.java.recursion;

public final class Factorial {

    private Factorial() {
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
