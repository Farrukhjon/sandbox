package io.github.farrukhjon.experiment.java.arrays;

import java.util.Arrays;

public class IsAElementsInArray {

	public static void main(String[] args) {
		Object[] obj = new Object[10];
		for (int i = 0, n = obj.length; i < n; i++) {
			if (i <= 3)
				obj[i] = new String("str" + i);
			else if (i <= 6)
				obj[i] = (double) i;
			else
				obj[i] = i;
		}
		System.out.println(Arrays.toString(obj));
	}
}
