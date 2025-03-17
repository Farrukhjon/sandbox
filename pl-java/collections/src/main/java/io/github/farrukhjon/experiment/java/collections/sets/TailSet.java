package io.github.farrukhjon.experiment.java.collections.sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class TailSet {
	public static void main(String[] args) {
		TreeSet<String> teeSet = new TreeSet<>();

		teeSet.add("1");
		teeSet.add("2");
		teeSet.add("3");
		teeSet.add("5");
		teeSet.add("4");

		SortedSet<String> sortedSet = teeSet.tailSet("2");
		System.out.println("Tail Set Contains : " + sortedSet);
		sortedSet.clear();
	}
}
