package com.refactor.taskmanager;

public class Task {
    private final String description;

    public Task(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Task description cannot be empty.");
        }
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
