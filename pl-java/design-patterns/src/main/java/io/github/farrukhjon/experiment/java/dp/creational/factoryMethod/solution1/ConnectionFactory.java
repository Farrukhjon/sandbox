package io.github.farrukhjon.experiment.java.dp.creational.factoryMethod.solution1;

public abstract class ConnectionFactory {

	public ConnectionFactory() {
	}

	protected abstract Connection createConnection(String type);
}
