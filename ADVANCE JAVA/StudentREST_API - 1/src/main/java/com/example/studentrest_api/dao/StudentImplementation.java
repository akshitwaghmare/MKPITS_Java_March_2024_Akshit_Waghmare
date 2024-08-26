package com.example.studentrest_api.dao;

import com.example.studentrest_api.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentImplementation implements StudentDAO {
    private EntityManager entityManager;

    @Autowired
    public StudentImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public List<Student> getAllStudents() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student", Student.class);
        return query.getResultList();
    }
    @Transactional
    @Override
    public Student getStudentById(int id) {
        Student student=entityManager.find(Student.class, id);
        return student;
    }

}
