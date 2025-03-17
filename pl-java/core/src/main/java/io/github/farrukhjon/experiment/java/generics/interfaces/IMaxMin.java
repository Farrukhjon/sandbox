package io.github.farrukhjon.experiment.java.generics.interfaces;

public interface IMaxMin<T extends Comparable<?>> {
	public T max();

	public T min();
}
