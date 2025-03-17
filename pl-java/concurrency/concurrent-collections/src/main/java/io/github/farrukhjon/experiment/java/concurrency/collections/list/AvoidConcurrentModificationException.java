package io.github.farrukhjon.experiment.java.concurrency.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentModificationException {

	public static void main(String[] args) {

		List<String> strList = new CopyOnWriteArrayList<>(Arrays.asList("a", "b", "c"));
		for (String str : strList) {
			System.out.println(str);
			strList.add("Add");
		}
		System.out.println(strList);
	}

}
