package com.refactor.ordermanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderManagerTest {

    @Test
    void testAddOrder() {
        OrderManager manager = new OrderManager();
        manager.add(new Order(new Customer("Charlie"), "Tablet"));
        assertEquals(1, manager.getAll().size());
    }

    @Test
    void testInvalidOrder() {
        assertThrows(IllegalArgumentException.class, () -> new Order(new Customer(""), "Phone"));
        assertThrows(IllegalArgumentException.class, () -> new Order(new Customer("Anna"), ""));
    }
}