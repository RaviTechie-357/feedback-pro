package com.feedback.FeedbackSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feedback.FeedbackSystem.entity.Student;

public interface LoginRepository extends JpaRepository<Student, Long> {
	
    Student findByStudentnameAndPassword(String studentname, String password);
}
