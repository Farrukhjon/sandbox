package io.github.farrukhjon.experiment.java.dp.behavioral.visitor;

/**
 * @author fsattorov
 */
public interface Animal {

    void makeSound();

    void accept(Visitor visitor);
}
