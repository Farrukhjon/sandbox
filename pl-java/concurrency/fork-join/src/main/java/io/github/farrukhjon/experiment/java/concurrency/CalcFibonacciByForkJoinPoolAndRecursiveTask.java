package io.github.farrukhjon.experiment.java.concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class CalcFibonacciByForkJoinPoolAndRecursiveTask {

    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();

        int num = 10;
        Long result = pool.invoke(new FibonacciTask(num));

        System.out.printf("Fibonacci number for %s is %s", num, result);
    }

    private static class FibonacciTask extends RecursiveTask<Long> {

        private final int num;

        FibonacciTask(int num) {
            this.num = num;
        }

        @Override
        protected Long compute() {
            if (num <= 1)
                return (long) num;
            return new FibonacciTask(num - 1).fork().join() + new FibonacciTask(num - 2).compute();
        }
    }
}
