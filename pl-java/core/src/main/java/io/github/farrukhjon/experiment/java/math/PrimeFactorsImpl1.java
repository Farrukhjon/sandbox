package io.github.farrukhjon.experiment.java.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsImpl1 implements PrimeFactors {
    @Override
    public List<Integer> getPrimeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactorsImpl1();

        List<Integer> primeFactors1 = primeFactors.getPrimeFactors(10);
        System.out.println(primeFactors1);

    }

}
