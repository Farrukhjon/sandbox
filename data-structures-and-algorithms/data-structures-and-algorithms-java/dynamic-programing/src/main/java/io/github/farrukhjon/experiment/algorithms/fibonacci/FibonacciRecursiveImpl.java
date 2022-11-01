package io.github.farrukhjon.experiment.algorithms.fibonacci;
public class FibonacciRecursiveImpl implements Fibonacci {

    @Override
    public long fibo(int n) {
        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
			int num = 10;
			Fibonacci fib = new FibonacciRecursiveImpl();
			long result = fib.fibo(num);
			System.out.printf("Fibonacci of %s number is %s %n", num, result);
    }
}
