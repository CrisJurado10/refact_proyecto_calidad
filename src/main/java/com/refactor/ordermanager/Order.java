package com.refactor.ordermanager;

public class Order {
    private final Customer customer;
    private final String product;

    public Order(Customer customer, String product) {
        if (product == null || product.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }
}