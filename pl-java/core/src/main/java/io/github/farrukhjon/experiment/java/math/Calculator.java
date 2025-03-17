package io.github.farrukhjon.experiment.java.math;

public class Calculator {

    /**
     * Sum a and b and return result of summation.
     **/
    public int sum(int a, int b) {
       int c = a + b;
       return c;
    }

    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        Calculator calculator = new Calculator();
        int result = calculator.sum(a, b);
        System.out.printf("Result: %d \n", result);
    }
}


