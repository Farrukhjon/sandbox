package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution1;

public abstract class IceCreamDecorator implements IIceCream {

	protected IIceCream	specialIceCream;

	public IceCreamDecorator(IIceCream specialIceCream) {
		this.specialIceCream = specialIceCream;
	}

	@Override
	public String makeIceCream() {
		return specialIceCream.makeIceCream();
	}
}
