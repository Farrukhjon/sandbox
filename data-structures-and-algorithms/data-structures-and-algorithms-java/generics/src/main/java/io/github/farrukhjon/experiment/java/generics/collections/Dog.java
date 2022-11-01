package io.github.farrukhjon.experiment.java.generics.collections;

public class Dog extends Animal {
	
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Hap hap");
	}
	
	@Override
	public String toString() {
		return name;
	}
}
