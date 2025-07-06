package com.refactor.studentmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    @Test
    void testAddStudent() {
        StudentManager manager = new StudentManager();
        manager.add(new Student("Jane Doe", 90.0));
        assertEquals(1, manager.getAll().size());
    }

    @Test
    void testInvalidGrade() {
        assertThrows(IllegalArgumentException.class, () -> new Student("Test", -5));
        assertThrows(IllegalArgumentException.class, () -> new Student("Test", 120));
    }

    @Test
    void testEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> new Student("", 90));
    }
}