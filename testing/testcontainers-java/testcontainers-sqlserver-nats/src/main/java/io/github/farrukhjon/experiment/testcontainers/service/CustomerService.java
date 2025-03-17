package io.github.farrukhjon.experiment.testcontainers.service;

import io.github.farrukhjon.experiment.testcontainers.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fsattorov
 */
public class CustomerService {

    private final DBConnectionProvider connectionProvider;

    public CustomerService(DBConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
        createCustomersTable();
    }

    public void createCustomer(Customer customer) {
        try (Connection conn = this.connectionProvider.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(
                "insert into customers(id, name) values(?, ?)"
            );
            pstmt.setLong(1, customer.id());
            pstmt.setString(2, customer.name());
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();

        try (Connection conn = this.connectionProvider.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(
                "select id, name from customers"
            );
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                customers.add(new Customer(id, name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customers;
    }

    private void createCustomersTable() {
        try (Connection conn = this.connectionProvider.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(
                """
                create table customers (
                    id integer not null,
                    name varchar(100) not null,
                    primary key (id)
                )
                """
            );
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
