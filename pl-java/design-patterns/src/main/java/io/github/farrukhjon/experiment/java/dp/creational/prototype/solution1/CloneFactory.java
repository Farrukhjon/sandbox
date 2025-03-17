package io.github.farrukhjon.experiment.java.dp.creational.prototype.solution1;

public class CloneFactory {
	public IPrototype makeClone(IPrototype prototype) {
		return prototype.cloneObject();
	}
}
