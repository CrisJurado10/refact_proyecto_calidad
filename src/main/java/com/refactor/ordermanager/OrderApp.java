package com.refactor.ordermanager;

public class OrderApp {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        manager.add(new Order(new Customer("Alice"), "Laptop"));
        manager.add(new Order(new Customer("Bob"), "Phone"));

        manager.getAll().forEach(order -> 
            System.out.println("Customer: " + order.getCustomer().getName() + ", Order: " + order.getProduct()));
    }
}