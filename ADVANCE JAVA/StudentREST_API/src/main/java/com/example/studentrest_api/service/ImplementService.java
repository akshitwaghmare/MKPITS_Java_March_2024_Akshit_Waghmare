package com.example.studentrest_api.service;

import com.example.studentrest_api.dao.StudentRepo;
import com.example.studentrest_api.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ImplementService implements StudentService {

    StudentRepo studentRepo;
    public ImplementService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    @Override
    public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        Optional<Student> studentOptional = studentRepo.findById(student.getId());
        if (studentOptional.isPresent()) {
            studentRepo.save(student);
        }
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
}
