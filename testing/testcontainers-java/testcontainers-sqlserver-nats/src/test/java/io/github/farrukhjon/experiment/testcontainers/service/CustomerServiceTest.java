package io.github.farrukhjon.experiment.testcontainers.service;

import static org.junit.jupiter.api.Assertions.*;

import io.github.farrukhjon.experiment.testcontainers.model.Customer;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MSSQLServerContainer;

/**
 * @author fsattorov
 */
class CustomerServiceTest {

    private static final String IMAGE_NAME = "mcr.microsoft.com/mssql/server:2019-latest";

    private static MSSQLServerContainer sqlServer =
        new MSSQLServerContainer<>(IMAGE_NAME)
            .acceptLicense();

    CustomerService customerService;

    @BeforeAll
    static void beforeAll() {
        sqlServer.start();
    }

    @AfterAll
    static void afterAll() {
        sqlServer.stop();
    }

    @BeforeEach
    void setUp() {
        DBConnectionProvider connectionProvider = new DBConnectionProvider(
            sqlServer.getJdbcUrl(),
            sqlServer.getUsername(),
            sqlServer.getPassword()
        );
        customerService = new CustomerService(connectionProvider);
    }

    @Test
    void shouldGetCustomers() {
        customerService.createCustomer(new Customer(1L, "George"));
        customerService.createCustomer(new Customer(2L, "John"));

        List<Customer> customers = customerService.getAllCustomers();
        assertEquals(2, customers.size());
    }

}