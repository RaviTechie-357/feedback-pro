package com.feedback.FeedbackSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.FeedbackSystem.entity.Feedback;
import com.feedback.FeedbackSystem.repository.FeedbackRepository;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    //CRUD 
    
    public Feedback createFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    public Feedback getFeedbackById(Long id) {
        return feedbackRepository.findById(id).orElse(null);
    }

    public Feedback updateFeedback(Long id, Feedback newFeedback) {
        Feedback existingFeedback = feedbackRepository.findById(id).orElse(null);
        if (existingFeedback != null) {
            existingFeedback.setStudent(newFeedback.getStudent());
            existingFeedback.setCourse(newFeedback.getCourse());
            existingFeedback.setRating(newFeedback.getRating());
            existingFeedback.setComment(newFeedback.getComment());
            return feedbackRepository.save(existingFeedback);
        }
        return null;
    }

    public void deleteFeedback(Long id) {
        feedbackRepository.deleteById(id);
    }
}
