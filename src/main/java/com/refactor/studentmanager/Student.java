package com.refactor.studentmanager;

public class Student {
    private final String name;
    private final double grade;

    public Student(String name, double grade) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
        if (grade < 0.0 || grade > 100.0) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}