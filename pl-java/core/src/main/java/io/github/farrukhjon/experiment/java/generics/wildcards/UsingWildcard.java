package io.github.farrukhjon.experiment.java.generics.wildcards;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class UsingWildcard {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("One", "Two", "Three", "Four");
		printList(strList);

		List<Character> charList = Arrays.asList('a', 'b', 'c', 'd');
		printList(charList);
	}

	private static void printList(List<? extends Serializable> list) {
		for (Object num : list) {
			System.out.println(num);
		}
	}
}
