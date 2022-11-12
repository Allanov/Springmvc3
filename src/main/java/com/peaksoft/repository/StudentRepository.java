package com.peaksoft.repository;

import com.peaksoft.entity.Student;

import java.util.List;

public interface StudentRepository {
    void save(Student student);

    void update(Student student);

    Student getById(Long id);

    List<Student> getAll();

    void removeStudent(Student student);
}
