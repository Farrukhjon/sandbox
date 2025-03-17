package io.github.farrukhjon.experiment.java.factorypattern;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);
}
