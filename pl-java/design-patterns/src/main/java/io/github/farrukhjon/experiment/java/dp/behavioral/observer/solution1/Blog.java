package io.github.farrukhjon.experiment.java.dp.behavioral.observer.solution1;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {

    private final List<Observer> observers;
    private boolean stateChange;

    public Blog() {
        this.observers = new ArrayList<>();
        stateChange = false;
    }

    public Object getUpdate() {
        Object changedState = null;
        // should have logic to send the
        // state change to querying observer
        if (stateChange) {
            changedState = "Observer Design Pattern";
        }
        return changedState;
    }

    public void notifyObserver() {
        if (stateChange) {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }

    public void postNewArticle() {
        stateChange = true;
        notifyObserver();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }
}
