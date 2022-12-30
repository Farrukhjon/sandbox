package io.github.farrukhjon.experiment.money.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
public class Account {

    private int id;

    @NotNull(message = "account number must not be null or empty")
    private String accountNumber;

    @NotNull(message = "client details should be provided")
    private Client client;

    @NotNull(message = "currency must not be null or empty")
    private String currency;

    private BigDecimal balance;

    public Account() {
    }

    public Account(Client client, String currency, BigDecimal balance) {
        this.client = client;
        this.currency = currency;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
