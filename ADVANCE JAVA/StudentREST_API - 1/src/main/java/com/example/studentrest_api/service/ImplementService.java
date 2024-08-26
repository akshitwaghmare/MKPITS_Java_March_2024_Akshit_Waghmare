package com.example.studentrest_api.service;

import com.example.studentrest_api.dao.StudentDAO;
import com.example.studentrest_api.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImplementService implements StudentService {

    StudentDAO studentDAO;
    public ImplementService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public Student findStudentById(int id) {
        return studentDAO.getStudentById(id);
    }
}
