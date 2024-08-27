package com.example.repo;

import com.example.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Additional query methods can be defined here
}
