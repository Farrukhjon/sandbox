package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution3;

public class Whip extends CondimentDecorator {

	private Beverage	beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.30;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Wip";
	}

}
