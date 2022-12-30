package io.github.farrukhjon.experiment.money;

import io.github.farrukhjon.experiment.money.datasource.ConnectionFactory;
import io.github.farrukhjon.experiment.money.datasource.HsqlDbConnectionFactoryImpl;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryUnitTest {

    @Test
    public void testHsqlDb() throws SQLException {

        ConnectionFactory connectionFactory = new HsqlDbConnectionFactoryImpl();
        Connection connection = connectionFactory.newConnection();

        Assert.assertNotNull(connection);
    }
}
