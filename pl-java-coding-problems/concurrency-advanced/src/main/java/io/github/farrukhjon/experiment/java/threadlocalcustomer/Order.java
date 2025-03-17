package io.github.farrukhjon.experiment.java.threadlocalcustomer;

public class Order {

    private final int customerId;

    public Order(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Order{" + "customerId=" + customerId + '}';
    }

}
