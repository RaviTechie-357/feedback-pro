package com.feedback.FeedbackSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.FeedbackSystem.entity.Student;
import com.feedback.FeedbackSystem.service.StudentService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	@Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> register(@RequestBody Student student) {
        Student registeredStudent = studentService.registerStudent(student);
        if (registeredStudent != null) {
            return new ResponseEntity<>(registeredStudent, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
