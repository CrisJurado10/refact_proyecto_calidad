package com.refactor.ordermanager;

public class Customer {
    private final String name;

    public Customer(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}