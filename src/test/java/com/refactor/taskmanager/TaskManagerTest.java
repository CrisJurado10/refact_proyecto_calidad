package com.refactor.taskmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void testAddTask() {
        TaskManager manager = new TaskManager();
        manager.add(new Task("Do laundry"));
        assertEquals(1, manager.getAll().size());
    }

    @Test
    void testRemoveTaskValid() {
        TaskManager manager = new TaskManager();
        manager.add(new Task("Do laundry"));
        manager.remove(0);
        assertEquals(0, manager.getAll().size());
    }

    @Test
    void testRemoveTaskInvalid() {
        TaskManager manager = new TaskManager();
        assertThrows(IllegalArgumentException.class, () -> manager.remove(0));
    }
}
