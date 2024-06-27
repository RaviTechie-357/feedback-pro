package com.feedback.FeedbackSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feedback.FeedbackSystem.entity.Student;

public interface RegisterRepository extends JpaRepository<Student, Long> {
	
    // Add custom methods for registration if needed
}
