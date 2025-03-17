package io.github.farrukhjon.experiment.java.dp.behavioral.iterator;

public interface Iterator {
	public Animal nextAnimal();

	public boolean isLastAnimal();

	public Animal currentAnimal();
}
