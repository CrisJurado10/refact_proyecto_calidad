package com.refactor.studentmanager;

public class StudentApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.add(new Student("John Doe", 85.5));
        manager.getAll().forEach(s -> 
            System.out.println("Student: " + s.getName() + ", Grade: " + s.getGrade()));
    }
}