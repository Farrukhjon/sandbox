package io.github.farrukhjon.experiment.java.dp.creational.factoryMethod.solution2;

public class Product1 implements IProduct {

	public Product1() {
	}

	@Override
	public void operation1() {
		System.out.println(Product1.class.getName());
	}

	@Override
	public void operation2() {
		System.out.println(Product1.class.getSimpleName());
	}
}
