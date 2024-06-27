package com.feedback.FeedbackSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.FeedbackSystem.entity.Feedback;
import com.feedback.FeedbackSystem.entity.Student;
import com.feedback.FeedbackSystem.service.FeedbackService;
import com.feedback.FeedbackSystem.service.StudentService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
		
	
	}
	
	
	
	
	
	
	
	
	/* @Autowired
	    private StudentService studentService;

	    @PostMapping
	    public ResponseEntity<Student> login(@RequestBody LoginRequest loginRequest) {
	        String studentname = loginRequest.getUsername();
	        String password = loginRequest.getPassword();
	        
	        Student student = studentService.getStudentByStudentnameAndPassword(Studentname, password);
	        if (student != null) {
	            return new ResponseEntity<>(student, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	        }
	    }
	    }
	    */


