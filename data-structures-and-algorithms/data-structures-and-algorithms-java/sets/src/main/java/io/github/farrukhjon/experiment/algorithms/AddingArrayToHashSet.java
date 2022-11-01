package io.github.farrukhjon.experiment.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddingArrayToHashSet {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 4, 5, 6, 8, 22, 34, 56, 0, 8, 8, 1 };
		final List<Integer> list = Arrays.asList(intArray);

		System.out.println(list);
		System.out.println("dublicate elements removed");

		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);

	}

}
