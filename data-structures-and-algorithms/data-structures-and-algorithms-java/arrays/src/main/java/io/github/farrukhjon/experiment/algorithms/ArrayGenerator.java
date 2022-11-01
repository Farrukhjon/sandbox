package io.github.farrukhjon.experiment.algorithms;

import java.util.Random;

public abstract class ArrayGenerator {

	public static Integer[] getInteger(Integer size) {
		Integer[] a = new Integer[size];
		Random r = new Random();
		for(int i = 0; i < a.length; i++){
			a[i] = r.nextInt(100001);
		}
		return a;
	}
	
}
