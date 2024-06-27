package com.feedback.FeedbackSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feedback.FeedbackSystem.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
