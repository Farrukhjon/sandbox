package io.github.farrukhjon.experiment.junit5.database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseTests {

    private ConnectionFactory connectionFactory;

    public DatabaseTests() {
        this.connectionFactory = new ConnectionFactory("hsql_test_conf.properties");
    }

    @BeforeEach
    void setUp() {

    }

    @Test
    void testConnection() {
        Connection connection = connectionFactory.getConnection();
        assertNotNull(connection);
    }

    @Test
    void test() {
        final Connection conn = connectionFactory.getConnection();
        connectionFactory.doInTransaction(() -> {
            try {
                String sql = "insert into employee(name, age) values(?, ?)";
                final PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, "Ali");
                ps.setString(2, "Valiev");
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }, conn);
    }
}
