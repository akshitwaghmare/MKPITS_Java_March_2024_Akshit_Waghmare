package com.example.studentrest_api.controller;

import com.example.studentrest_api.entity.Student;
import com.example.studentrest_api.exception.StudentErrorResponse;
import com.example.studentrest_api.exception.StudentNotFoundException;
import com.example.studentrest_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class StudentController {
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @GetMapping("/student/{id}")
//    public Student student(@PathVariable("id") int id) {
//        Student student = studentService.findStudentById(id);
//        return student;
//    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") int id) {
        if(id<0 || id>100) {
            throw new StudentNotFoundException("Student not found");
        }
        Student student = studentService.findStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
//    @GetMapping("/students")
//    public List<Student> studentList(){
//        return studentService.findAllStudents();
//    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> students()
    {
        List<Student> students = studentService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


}
