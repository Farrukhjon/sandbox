package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution3;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House blend";
	}

	@Override
	public double cost() {
		return 1.45;
	}

}
