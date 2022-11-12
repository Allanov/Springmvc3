package com.peaksoft.repository.repoimpl;

import com.peaksoft.entity.Student;
import com.peaksoft.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    public Student getById(Long id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> getAll() {
        return entityManager.createQuery("from Student", Student.class).getResultList();
    }

    @Override
    public void removeStudent(Student student) {
        entityManager.remove(entityManager.contains(student) ? student : entityManager.merge(student));
    }
}
