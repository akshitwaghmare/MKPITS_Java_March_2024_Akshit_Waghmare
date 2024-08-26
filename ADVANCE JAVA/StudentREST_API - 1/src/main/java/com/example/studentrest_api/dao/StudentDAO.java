package com.example.studentrest_api.dao;

import com.example.studentrest_api.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();
    Student getStudentById(int id);
}
