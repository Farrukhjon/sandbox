package io.github.farrukhjon.experiment.java.math;


public class Prime {

    public static void main(String[] args) {
        int k = 1;
        int n = 100;

        print_primes(k, n);
    }

    private static void print_primes(final int k, final int n) {
        for (int i = k; i <= n; i++) {
            if (isPrime(i)){
                System.out.printf(" %s ", i);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n > 1) {
            int m = n / 2;
            for (int i = 2; i < m; i++) {
                if (n % i == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

}
