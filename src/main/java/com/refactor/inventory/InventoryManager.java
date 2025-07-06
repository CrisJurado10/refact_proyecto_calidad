package com.refactor.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return new ArrayList<>(products);
    }
}
