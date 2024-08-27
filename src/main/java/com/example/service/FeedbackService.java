// src/main/java/com/example/service/FeedbackService.java
package com.example.service;

import com.example.entity.Feedback;
import com.example.repo.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback submitFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getFeedbackForDoctor(Long doctorId) {
        return feedbackRepository.findAllByDoctorId(doctorId);
    }
}
