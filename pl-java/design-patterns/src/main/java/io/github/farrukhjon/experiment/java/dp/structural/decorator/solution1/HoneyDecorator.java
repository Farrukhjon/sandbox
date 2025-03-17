package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution1;

public class HoneyDecorator extends IceCreamDecorator {

	public HoneyDecorator(IIceCream specialIceCream) {
		super(specialIceCream);
	}

	private String addNoney(){
		return " + sweet honey";
	}

	@Override
	public String makeIceCream() {
		return specialIceCream.makeIceCream() + addNoney();
	}
}
