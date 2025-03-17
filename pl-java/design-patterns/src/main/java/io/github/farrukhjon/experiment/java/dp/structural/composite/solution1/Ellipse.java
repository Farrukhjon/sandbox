package io.github.farrukhjon.experiment.java.dp.structural.composite.solution1;

public class Ellipse implements IGraphic {

    @Override
    public void print() {
        System.out.printf("%-7s %1s %n", this.getClass().getSimpleName(), this.hashCode());
    }
}
