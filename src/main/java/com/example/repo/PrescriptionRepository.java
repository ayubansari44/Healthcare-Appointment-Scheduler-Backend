// src/main/java/com/example/repository/PrescriptionRepository.java
package com.example.repo;

import com.example.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    List<Prescription> findAllByAppointmentId(Long appointmentId);
}

