package com.refactor.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public List<Task> getAll() {
        return new ArrayList<>(tasks);
    }

    public void remove(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IllegalArgumentException("Invalid task index.");
        }
        tasks.remove(index);
    }
}
