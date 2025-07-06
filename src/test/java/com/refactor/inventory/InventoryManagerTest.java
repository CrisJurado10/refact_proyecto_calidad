package com.refactor.inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {

    @Test
    void testAddProduct() {
        InventoryManager manager = new InventoryManager();
        manager.add(new Product("Tablet", 3, 500.0));
        assertEquals(1, manager.getAll().size());
    }

    @Test
    void testInvalidProduct() {
        assertThrows(IllegalArgumentException.class, () -> new Product("", 3, 500));
        assertThrows(IllegalArgumentException.class, () -> new Product("Tablet", -1, 500));
        assertThrows(IllegalArgumentException.class, () -> new Product("Tablet", 1, -50));
    }
}