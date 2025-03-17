package io.github.farrukhjon.experiment.java.generics.varargs;

public class VarargsDemo {

    public static void main(String[] args) {
        int sumResult = sum(1, 2, 3);
        assert sumResult == 6;
    }

    private static int sum(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
}
