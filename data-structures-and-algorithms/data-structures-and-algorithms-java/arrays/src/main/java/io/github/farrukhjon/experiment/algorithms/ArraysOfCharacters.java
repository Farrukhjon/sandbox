package io.github.farrukhjon.experiment.algorithms;
public class ArraysOfCharacters {

	public static void main(String[] arg) {

		char[] message = new char[5];
		java.util.Arrays.fill(message, 'A');
		for (char ch : message) {
			System.out.println(ch);
		}
	}
}
