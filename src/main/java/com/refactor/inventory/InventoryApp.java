package com.refactor.inventory;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.add(new Product("Laptop", 5, 1000.0));
        manager.getAll().forEach(p -> System.out.println(
            "Product: " + p.getName() + ", Quantity: " + p.getQuantity() + ", Price: $" + p.getPrice()));
    }
}
