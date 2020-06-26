package com.june.app.controller;

import com.june.app.domain.Student;
import com.june.app.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
