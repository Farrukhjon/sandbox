package io.github.farrukhjon.experiment.java.dp.behavioral.observer.solution2;

public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
