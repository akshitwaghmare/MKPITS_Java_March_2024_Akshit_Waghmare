package com.example.springhibernatejpa_cli.StudentDAO;

import com.example.springhibernatejpa_cli.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentImplementation implements StudentDAO {
    private EntityManager em;
    public StudentImplementation(EntityManager em) {
        this.em = em;
    }

    @Transactional
    @Override
    public void create(Student student) {
        em.persist(student);
    }
    @Override
    public Student read(int id) {
        Student student=em.find(Student.class, id);
        System.out.println(student);
        return student;
    }

    @Transactional
    @Override
    public void update(Student student) {
        em.merge(student);
        System.out.println("Student updated");
    }

    @Transactional
    @Override
    public void delete(int id ) {
        Student student = em.find(Student.class,id);
        em.remove(student);
        System.out.println("Deleted student with id " + id);
    }
    @Transactional
    @Override
    public List<Student> showAll() {
        return em.createQuery("from Student", Student.class).getResultList();
    }

}
