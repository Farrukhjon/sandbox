package io.github.farrukhjon.experiments.javaGroovy;

import groovy.lang.Closure;

public class TypeOfClosure {

	public static void main(String[] args) {
		Closure closure = Closure.IDENTITY;
		System.out.println(closure);
	}

}
