package io.github.farrukhjon.experiment.jmokit.mocking;

public class Parent {
    
    public Parent(final String name) {
        throw new IllegalArgumentException("Do not call me!");
    }

}
