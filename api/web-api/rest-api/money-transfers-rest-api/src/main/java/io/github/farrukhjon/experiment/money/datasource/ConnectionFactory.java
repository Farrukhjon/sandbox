package io.github.farrukhjon.experiment.money.datasource;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionFactory {

    Connection newConnection() throws SQLException;

}
