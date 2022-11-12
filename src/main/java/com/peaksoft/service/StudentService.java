package com.peaksoft.service;

import com.peaksoft.entity.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);

    void update(Student student);

    Student getById(Long id);

    List<Student> getAll();

    void removeStudent(Student student);
}
