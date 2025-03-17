package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution2;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(IPizza tempPizza) {
		super(tempPizza);
		System.out.println("Adding sauce");
	}

	@Override
	public String getDescriptin() {
		return super.getDescriptin() + "Tomato Sauce";
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.12;
	}

}
