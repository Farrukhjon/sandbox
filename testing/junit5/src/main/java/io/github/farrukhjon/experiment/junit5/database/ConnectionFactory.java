package io.github.farrukhjon.experiment.junit5.database;

import org.hsqldb.jdbc.JDBCDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private DataSource dataSource;

    public ConnectionFactory(String dataSourceConfigFileName) {
        String path = Thread.currentThread()
                .getContextClassLoader()
                .getResource("")
                .getPath()
                .concat(dataSourceConfigFileName);
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(path));
            final DataSource dataSource = JDBCDataSourceFactory
                    .createDataSource(properties);
            this.dataSource = dataSource;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            final Connection connection = dataSource.getConnection();
            return connection;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void doInTransaction(Runnable r, Connection conn) {
        try {
            conn.setAutoCommit(false);
            r.run();
            conn.commit();
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
