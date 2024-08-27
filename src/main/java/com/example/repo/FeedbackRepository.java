package com.example.repo;

// src/main/java/com/example/repository/FeedbackRepository.java
//package com.example.repo;

import com.example.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findAllByDoctorId(Long doctorId);
}

