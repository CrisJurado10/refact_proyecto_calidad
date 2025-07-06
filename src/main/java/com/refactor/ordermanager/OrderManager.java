package com.refactor.ordermanager;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private final List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);
    }

    public List<Order> getAll() {
        return new ArrayList<>(orders);
    }
}