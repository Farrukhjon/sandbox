package io.github.farrukhjon.experiment.java.collections.arraylist;

import java.util.ArrayList;

public class ContainStringElement {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		boolean contain = list.contains(new String("One"));
		System.out.println(contain);
	}

}
