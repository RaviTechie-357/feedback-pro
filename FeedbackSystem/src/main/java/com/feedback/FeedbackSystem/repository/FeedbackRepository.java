package com.feedback.FeedbackSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feedback.FeedbackSystem.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    
}
