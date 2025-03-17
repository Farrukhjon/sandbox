package io.github.farrukhjon.experiment.java.dp.creational.prototype.solution1;

public class Client {

	public static void main(String[] args) {

		CloneFactory factory = new CloneFactory();

		ConcretePrototype concretePrototype = new ConcretePrototype();
		ConcretePrototype concretePrototype2 = (ConcretePrototype) factory.makeClone(concretePrototype);

		System.out.println("concretePrototype hashCode: " + System.identityHashCode(concretePrototype));
		System.out.println("concretePrototype2 hashCode: " + System.identityHashCode(concretePrototype2));
	}
}
