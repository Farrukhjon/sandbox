package io.github.farrukhjon.experiment.java.writingfunctionalinterfaces;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
}
