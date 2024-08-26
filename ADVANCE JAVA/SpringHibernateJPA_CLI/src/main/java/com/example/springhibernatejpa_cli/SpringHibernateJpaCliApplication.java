package com.example.springhibernatejpa_cli;

import com.example.springhibernatejpa_cli.StudentDAO.StudentDAO;
import com.example.springhibernatejpa_cli.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHibernateJpaCliApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateJpaCliApplication.class, args);
    }
    @Bean
    public CommandLineRunner init(StudentDAO studentDAO)

    public void createStudent(StudentDAO studentDAO){
        Student student = new Student("Daksh Parekh","daksh.2001@gmail.com");
        studentDAO.create(student);
    }

    public void read(StudentDAO studentDAO,int id){
        studentDAO.read(id);
    }

    public void updateStudent(StudentDAO studentDAO,int id){
        Student student = studentDAO.read(id);
        student.setName("Adarsh");
        studentDAO.update(student);
    }

    public void deleteStudent(StudentDAO studentDAO,int id){
        studentDAO.delete(id);
    }

    public void showAllStudents(StudentDAO studentDAO){
        studentDAO.showAll();
    }
}
