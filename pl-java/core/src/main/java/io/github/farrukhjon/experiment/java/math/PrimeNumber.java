package io.github.farrukhjon.experiment.java.math;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * A prime number (or a prime) is a Natural number greater than 1 that has no positive divisors other than 1 and itself.
 * Решето Эратосфена - алгоритм нахождения всех простых чисел до некоторого целого числа n,
 */
public class PrimeNumber {

    private final int number;

    public PrimeNumber(final int number) {
        this.number = number;
    }

    /**
     * This algorithm allows iterate only up through the square root of n
     *
     * @return prime number if true, or composite number if false.
     */
    public boolean isPrime() {
        if (this.number < 2) {
            return false;
        }
        for (int i = 2; i < (int) sqrt(number); i++) {
            if (number % 2 == 0) // divide by module
                return false;
        }
        return true;
    }

    public static List<Integer> getPrimesOf(int number) {
        boolean[] tmp = new boolean[number];
        Arrays.fill(tmp, true);
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= sqrt(number); i++) {
            if (tmp[i]) {
                for (int k = 1, j = (int) pow(i, 2); j < number; j = (int) pow(i, 2) + (i *= k++)) {
                    tmp[j] = false;
                }
            }
        }
        for (int i = 2; i < number; i++) {
            if (tmp[i])
                primeList.add(i);
        }
        return primeList;
    }

}
