package io.github.farrukhjon.experiment.java.observerpattern;

public interface FireStationRegister {

    void registerFireStation(FireObserver fo);
    void notifyFireStations(String address);
}
