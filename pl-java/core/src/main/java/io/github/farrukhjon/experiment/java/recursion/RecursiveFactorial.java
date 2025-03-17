package io.github.farrukhjon.experiment.java.recursion;

public class RecursiveFactorial {

    public static void main(String[] args) {
        long result = recursiveFac(25);
        System.out.println("elapsed time for recursive:" + result);
    }

    private static long recursiveFac(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * recursiveFac(n - 1);
    }

}
