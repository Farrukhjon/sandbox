package io.github.farrukhjon.experiment.java.loops;

public class IterativeFactorial {

	public static void main(String[] args) {
		long result = iterativeFac(25);
		System.out.println(result);
	}

	private static long iterativeFac(int n) {
		if (n == 0 || n == 1)
			return 1;
		long result = 1;
		for (int i = 2; i <= n; i++)
			result = result * i;
		return result;
	}
}
