package io.github.farrukhjon.experiment.java.observerpattern;

public class DecaturFireStation implements FireObserver {

    @Override
    public void fire(String address) {
        if(address.contains("Decatur")) {
            System.out.println("Decatur fire station will go to this fire");
        }
    }

}