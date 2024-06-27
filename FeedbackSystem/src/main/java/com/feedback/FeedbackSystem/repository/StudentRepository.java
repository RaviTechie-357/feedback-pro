package com.feedback.FeedbackSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feedback.FeedbackSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
