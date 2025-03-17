package io.github.farrukhjon.experiment.java.dp.behavioral.observer.solution1;

public interface Subject {

	public Object getUpdate();

	public void notifyObserver();

	public void registerObserver(Observer observer);

	public void unRegisterObserver(Observer observer);

}
