package io.github.farrukhjon.experiment.java.dp.creational.factoryMethod.solution1;

public class SQLServerConnection extends Connection {

	public SQLServerConnection() {
	}

	@Override
	public String description() {
		return "SQL Server";
	}

}
