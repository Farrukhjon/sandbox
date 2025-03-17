package io.github.farrukhjon.experiment.java.strings;

import java.util.stream.IntStream;

public class StringCharsMethod {

	public static void main(String[] args) {

		String alphabet = "abcdef";
		IntStream charsStream = alphabet.chars();

		charsStream.forEach(ch -> System.out.println((char)ch));
	}

}
