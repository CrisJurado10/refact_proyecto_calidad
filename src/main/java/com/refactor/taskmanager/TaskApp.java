package com.refactor.taskmanager;

public class TaskApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.add(new Task("Complete project"));
        manager.getAll().forEach(task -> System.out.println("Task: " + task.getDescription()));
        manager.remove(0);
    }
}
