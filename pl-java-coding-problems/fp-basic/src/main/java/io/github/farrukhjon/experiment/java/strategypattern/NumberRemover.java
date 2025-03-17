package io.github.farrukhjon.experiment.java.strategypattern;

public class NumberRemover implements RemoveStrategy {

    @Override
    public String execute(String s) {
        return s.replaceAll("\\d","");
    }
}
