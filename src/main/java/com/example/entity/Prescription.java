// src/main/java/com/example/entity/Prescription.java
package com.example.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prescriptions")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @Column(name = "medication", nullable = false)
    private String medication;

    @Column(name = "dosage", nullable = false)
    private String dosage;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    // Getters and Setters
}
