package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution3;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark roast";
	}

	@Override
	public double cost() {
		return 1.32;
	}

}
