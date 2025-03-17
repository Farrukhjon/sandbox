package io.github.farrukhjon.experiment.java.dp.enterprise.integration.dao;

import java.sql.SQLException;

public interface UserService {

	public void add(User user) throws SQLException;
	public void delete(User user) throws SQLException;
	public void update(User user) throws SQLException;

}
