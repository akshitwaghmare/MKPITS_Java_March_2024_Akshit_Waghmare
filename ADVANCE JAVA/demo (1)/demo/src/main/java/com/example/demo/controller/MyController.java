package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/main" , method = RequestMethod.GET)
public class MyController {

    List<Student> students;

    public MyController() {
        students = new ArrayList<>();
    }
    @GetMapping("/index")
    public String index() {
        return "<h1>Hello World</h1>";
    }
    @GetMapping("/second")
    public String second() {
        return "<h1>Welcome Back</h1>";
    }

    @GetMapping("/student")
    public Student getStudent() {
        Student student = new Student(1,"Akshit","Nagpur");
        return student;
    }
    @GetMapping("/list")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"Akshit","Nagpur"));
        students.add(new Student(2,"Daksh","New York"));
        students.add(new Student(3,"Adarsh","Pune"));
        return students;
    }

    @GetMapping("/create")
    public Student createStudent(@RequestParam(name="id")Integer id,@RequestParam(name="name")String name, @RequestParam(name="city")String city) {
        Student student = new Student(id,name,city);
        students.add(student);
        return student;
    }

    @GetMapping("/getid")
    public Student getStudentById(@RequestParam(name="id")Integer id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
        //   OR
        //return students.stream().filter(s->s.getId()==id).findFirst().get();
    }
    @GetMapping("/view")
    public List<Student> displayStudents() {
        return students;
    }
}
