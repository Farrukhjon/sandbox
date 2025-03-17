package io.github.farrukhjon.experiment.java.bitwise;

public class PowerOfNumber {


	public static void main(String[] args) {
		int result = getPowerOfTwo(2); // 2^2
		System.out.println(result);
	}

	private static int getPowerOfTwo(int pow) {
		return 1 << pow;
	}

}
