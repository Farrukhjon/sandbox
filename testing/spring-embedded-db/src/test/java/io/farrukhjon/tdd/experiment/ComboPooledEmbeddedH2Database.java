package io.github.farrukhjon.tdd.experiment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Driver;
import java.sql.SQLException;

@Configuration
public class ComboPooledEmbeddedH2Database {

    @Bean
    public ComboPooledDataSource dataSource() {
        EmbeddedDatabase embeddedDatabase = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:scripts/create.sql")
                .setDataSourceFactory(new ComboPoolDataSourceFactory())
                .build();
        try {
            return embeddedDatabase.unwrap(ComboPooledDataSource.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static class ComboPoolDataSourceFactory implements DataSourceFactory, ConnectionProperties {

        private final ComboPooledDataSource dataSource;

        public ComboPoolDataSourceFactory() {
            this(CustomComboPooledDataSource.newComboPooledDataSource());
        }

        private ComboPoolDataSourceFactory(ComboPooledDataSource dataSource) {
            this.dataSource = dataSource;
        }

        @Override
        public ConnectionProperties getConnectionProperties() {
            return this;
        }

        @Override
        public DataSource getDataSource() {
            return dataSource;
        }

        @Override
        public void setDriverClass(Class<? extends Driver> aClass) {
            try {
                dataSource.setDriverClass(aClass.getName());
            } catch (PropertyVetoException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void setUrl(String url) {
            dataSource.setJdbcUrl(url);
        }

        @Override
        public void setUsername(String userName) {
            dataSource.setUser(userName);
        }

        @Override
        public void setPassword(String password) {
            dataSource.setPassword(password);
        }
    }

    private static class CustomComboPooledDataSource {

        public static ComboPooledDataSource newComboPooledDataSource() {
            ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
            comboPooledDataSource.setInitialPoolSize(1);
            comboPooledDataSource.setMaxPoolSize(1);
            comboPooledDataSource.setMinPoolSize(1);
            comboPooledDataSource.setMaxIdleTime(10);
            return comboPooledDataSource;
        }
    }
}
