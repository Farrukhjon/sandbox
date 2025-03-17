package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution1;

public class NuttyDecorator extends IceCreamDecorator {

	public NuttyDecorator(IIceCream specialIceCream) {
		super(specialIceCream);
	}

	private String addNuts(){
		return " + crunchy nuts";
	}

	@Override
	public String makeIceCream() {
		return specialIceCream.makeIceCream() + addNuts();
	}
}
