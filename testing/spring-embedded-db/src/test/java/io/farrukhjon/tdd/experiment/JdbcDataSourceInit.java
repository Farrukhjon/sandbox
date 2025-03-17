package io.github.farrukhjon.tdd.experiment;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JdbcDataSourceInit {

    private final JdbcDataSource dataSource;

    public JdbcDataSourceInit() {
        dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:mem:sample;INIT=RUNSCRIPT FROM 'classpath:scripts/create.sql'");
        dataSource.setUser("sa");
        dataSource.setPassword("sa");
    }

    public JdbcDataSource getDataSource() {
        return dataSource;
    }

    @Test
    void testDataSource() {
        assertNotNull(dataSource);
    }

}
