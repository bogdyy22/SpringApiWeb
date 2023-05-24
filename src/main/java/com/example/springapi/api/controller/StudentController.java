package com.example.springapi.api.controller;

import com.example.springapi.api.model.Student;
import com.example.springapi.server.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("/student")
    public Student getStudent(@RequestParam Long id){
        Optional student = studentService.getStudent(id);
        if(student.isPresent()) {
            return (Student) student.get();
        }
        return null;
    }
}
