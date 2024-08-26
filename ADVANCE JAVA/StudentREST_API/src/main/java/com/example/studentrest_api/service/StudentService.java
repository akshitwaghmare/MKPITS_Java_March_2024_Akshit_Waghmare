package com.example.studentrest_api.service;

import com.example.studentrest_api.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudents();
    Student findStudentById(int id);
    void addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(int id);

}
