package io.github.farrukhjon.experiment.java.strings;

public class IntStreamCharsToString {

	public static void main(String[] args) {

		String alphabet = "abcdef";

		StringBuilder sb = new StringBuilder();
		alphabet
										.chars()
										.forEach(chInt -> {
											sb.append((char)chInt);
										});

		String str  = sb.toString();
		System.out.print(str);
	}

}
