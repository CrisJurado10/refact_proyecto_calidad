package com.refactor.studentmanager;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> getAll() {
        return new ArrayList<>(students);
    }
}