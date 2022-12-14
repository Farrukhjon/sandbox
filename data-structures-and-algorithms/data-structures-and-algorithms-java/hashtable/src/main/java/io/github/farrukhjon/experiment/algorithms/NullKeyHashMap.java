package io.github.farrukhjon.experiment.algorithms;

import java.util.HashMap;

public class NullKeyHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> nullMap = new HashMap<>();
		
		nullMap.put(null, "this is null");
		
		String nullValue = nullMap.get(null);
		System.out.println(nullValue);

		nullMap.put(null, "this is second null");

		nullValue = nullMap.get(null);

		System.out.println(nullValue);

		nullMap.put(0, "this is third 0");
		nullValue = nullMap.get(0);
		System.out.println(nullValue);
		
		System.out.println("size: " + nullMap.size());
		
		System.out.println(nullMap.containsKey(null));
		System.out.println(nullMap.containsKey(0));
	}

}
