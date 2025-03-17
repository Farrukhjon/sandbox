package io.github.farrukhjon.experiment.java.dp.enterprise.integration.dao;

import java.sql.SQLException;

public class DemoDAO {

	public static void main(String[] args) throws SQLException {

		User user = new User();
		user.setFirstName("Den");
		user.setName("Baba");
		user.setPatrpnymic("Yamamoto");
		user.setAge(23);
		user.setCourse("Math");

		UserImpl impl = new UserImpl();
		impl.add(user);

	}
}
