package com.example.springhibernatejpa_cli.StudentDAO;

import com.example.springhibernatejpa_cli.entity.Student;

import java.util.List;

public interface StudentDAO {
    void create(Student student);
    Student read(int id);
    void update(Student student);
    void delete(int id);
    List<Student> showAll();
}
