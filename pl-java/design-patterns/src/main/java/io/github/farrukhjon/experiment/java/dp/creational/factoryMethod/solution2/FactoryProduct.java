package io.github.farrukhjon.experiment.java.dp.creational.factoryMethod.solution2;

public class FactoryProduct implements IFactoryProduct {

	@Override
	public IProduct createProduct(String name) {
		if (name.equals("Product1"))
			return new Product1();
		else if (name.equals("Product2"))
			return new Product2();
		else
			return null;
	}
}
