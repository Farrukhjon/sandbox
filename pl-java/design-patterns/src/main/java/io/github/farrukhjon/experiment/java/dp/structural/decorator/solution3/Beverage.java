package io.github.farrukhjon.experiment.java.dp.structural.decorator.solution3;

public abstract class Beverage {

	String	description	= "Unknown beverage";

	int		size;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
