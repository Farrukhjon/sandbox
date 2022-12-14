package io.github.farrukhjon.experiment.java.generics.constructors;

public class GenConstructor {

	private final double value;

	public <T extends Number> GenConstructor(T arg) {
		this.value = arg.doubleValue();
	}

	private void showValue() {
		System.out.println("value = " + value);
	}

	public static void main(String[] args) {
		GenConstructor genCons1 = new GenConstructor(100);
		genCons1.showValue();
		GenConstructor genCons2 = new GenConstructor(100.53F);
		genCons2.showValue();
	}
}
