package io.github.farrukhjon.experiment.java.dp.creational.builder.solution2;

/**
 * @author Farrukhjon SATTOROV
 */
public abstract class PizzaBuilder {

	protected Pizza	pizza;

	public abstract void buildDough();

	public abstract void buildSouce();

	public abstract void buildTopping();

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public Pizza getPizza() {
		return pizza;
	}

}
