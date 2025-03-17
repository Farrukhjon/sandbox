package io.github.farrukhjon.experiment.java.dp.creational.builder.solution4;

public interface IBuilder<T> extends IRecipe<IBuilder<T>> {

	T build();
}
