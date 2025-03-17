package io.github.farrukhjon.experiment.java.dp.creational.builder.solution1;

public abstract class AbstractBuilder {

	public static AbstractBuilder getInstance() {
		AbstractBuilder builder = null;
		return builder;
	}

	public abstract void buildPart();

}
