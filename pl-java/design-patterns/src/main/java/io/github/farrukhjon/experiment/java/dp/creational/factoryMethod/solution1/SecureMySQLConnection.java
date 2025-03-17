package io.github.farrukhjon.experiment.java.dp.creational.factoryMethod.solution1;

public class SecureMySQLConnection extends Connection {

	public SecureMySQLConnection() {
	}

	@Override
	public String description() {
		return "MySQL secure";
	}

}
