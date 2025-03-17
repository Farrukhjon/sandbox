package io.github.farrukhjon.experiment.java.dp.creational.prototype.solution1;

public class ConcretePrototype implements IPrototype {

	@Override
	public IPrototype cloneObject() {
		ConcretePrototype prototype = null;
		try {
			prototype = (ConcretePrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
}
