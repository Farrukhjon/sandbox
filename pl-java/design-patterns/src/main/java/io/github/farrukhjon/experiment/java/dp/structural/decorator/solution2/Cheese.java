package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution2;

public class Cheese extends ToppingDecorator {

	public Cheese(IPizza tempPizza) {
		super(tempPizza);
		System.out.println("Adding cheese");
	}

	@Override
	public String getDescriptin() {
		return super.getDescriptin() + ", Cheese ";
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.17;
	}

}
