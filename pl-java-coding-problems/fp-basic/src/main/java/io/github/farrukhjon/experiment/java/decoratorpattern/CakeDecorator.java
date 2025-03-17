package io.github.farrukhjon.experiment.java.decoratorpattern;

public class CakeDecorator implements Cake {

    private final Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String decorate() {
        return cake.decorate();
    }

}
