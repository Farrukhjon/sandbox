package io.github.farrukhjon.experiment.java.decoratorpattern;

public class BaseCake implements Cake {

    @Override
    public String decorate() {
        return "Base cake ";
    }
}
