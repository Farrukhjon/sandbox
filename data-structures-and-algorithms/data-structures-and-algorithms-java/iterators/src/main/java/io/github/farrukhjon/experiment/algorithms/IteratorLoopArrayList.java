package io.github.farrukhjon.experiment.algorithms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLoopArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);

		al.set(5, 66);

		for (Iterator<Integer> i = al.iterator(); i.hasNext();) {
			Integer integer = (Integer) i.next();
			System.out.println(integer);
		}
	}
}
