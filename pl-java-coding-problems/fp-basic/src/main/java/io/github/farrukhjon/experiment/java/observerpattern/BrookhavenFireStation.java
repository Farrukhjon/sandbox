package io.github.farrukhjon.experiment.java.observerpattern;

public class BrookhavenFireStation implements FireObserver {

    @Override
    public void fire(String address) {
        if(address.contains("Brookhaven")) {
            System.out.println("Brookhaven fire station will go to this fire");
        }
    }

}
