package io.github.farrukhjon.experiment.java.dp.creational.abstractFactories.solution1;

/**
 * Description of AbstractFactory.
 */
public abstract class AbstractFactory implements IFactory {

	public AbstractFactory() {
		super();
	}

	public IProduct createProductA() {
		IProduct createProductA = null;
		return createProductA;
	}

	public IProduct createProductB() {
		IProduct createProductB = null;
		return createProductB;
	}

}
