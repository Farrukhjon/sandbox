package io.github.farrukhjon.experiment.java.checkdefaultmethods;

public interface Slicer {

    public void type();

    default void slice() {
        System.out.println("slice");
    }
}
