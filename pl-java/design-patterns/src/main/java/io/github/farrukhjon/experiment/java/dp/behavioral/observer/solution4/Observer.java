package io.github.farrukhjon.experiment.java.dp.behavioral.observer.solution4;

public interface Observer {

	public void update(float temperature, float humidity, float pressure);

	public void deleteSubscription();
}
