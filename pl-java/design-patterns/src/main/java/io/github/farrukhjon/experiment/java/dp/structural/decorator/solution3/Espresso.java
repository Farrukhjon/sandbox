package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution3;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return size * 3.21;
	}

}
