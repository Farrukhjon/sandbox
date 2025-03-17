package io.github.farrukhjon.experiment.java.dp.structural.composite.solution1;

public class Circle implements IGraphic {

	@Override
	public void print() {
		System.out.printf("%-7s %1s %n", Circle.class.getSimpleName(), this.hashCode());
	}

}
