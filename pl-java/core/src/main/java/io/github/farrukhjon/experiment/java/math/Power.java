package io.github.farrukhjon.experiment.java.math;


import static java.lang.Math.pow;

public class Power {

    public static void main(String[] args) {
        double result = R(2, 100);
        System.out.printf("Result:" + result);
    }

    static double R(double t, double l) {
        return 3 * pow(t, 2) + 3 * pow(l, 5) + 4.9;
    }


}
