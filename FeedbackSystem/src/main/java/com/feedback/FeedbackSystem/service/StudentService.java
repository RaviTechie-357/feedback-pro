package com.feedback.FeedbackSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.FeedbackSystem.entity.Student;
import com.feedback.FeedbackSystem.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // CRUD
    
    public Student createStudent(Student student) {
        try {
            return studentRepository.save(student);
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
            return null;
        }
    }

    public List<Student> getAllStudents() {
        try {
            return studentRepository.findAll();
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
            return null;
        }
    }

    public Student getStudentById(Long id) {
        try {
            return studentRepository.findById(id).orElse(null);
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
            return null;
        }
    }

    public Student updateStudent(Long id, Student newStudent) {
        try {
            Student existingStudent = studentRepository.findById(id).orElse(null);
            if (existingStudent != null) {
                existingStudent.setStudentname(newStudent.getStudentname());
                existingStudent.setPassword(newStudent.getPassword());
                existingStudent.setStudentType(newStudent.getStudentType());
                return studentRepository.save(existingStudent);
            }
            return null;
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
            return null;
        }
    }

    public void deleteStudent(Long id) {
        try {
            studentRepository.deleteById(id);
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
        }
    }

	public Student registerStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}