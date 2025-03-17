package io.github.farrukhjon.experiment.java.dp.creational.factoryMethod.solution1;

public class SecureFactory extends ConnectionFactory {

	@Override
	protected Connection createConnection(String type) {
		if (type.equals("Oracle"))
			return new SecureOracleConnection();
		else if (type.equals("SQL Server"))
			return new SecureSQlServerConnection();
		else
			return new SecureMySQLConnection();
	}
}
