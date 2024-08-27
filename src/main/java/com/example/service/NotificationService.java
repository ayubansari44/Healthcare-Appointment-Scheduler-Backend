package com.example.service;

// src/main/java/com/example/service/NotificationService.java
//package com.example.service;

import com.example.entity.Appointment;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(String recipient, String message) {
        // Simulate sending a notification (e.g., email or SMS)
        System.out.println("Sending notification to " + recipient + ": " + message);
    }

    public void notifyAboutAppointment(Appointment appointment) {
        String doctorMessage = "Upcoming appointment with patient " + appointment.getPatient().getFirstName() +
                " " + appointment.getPatient().getLastName() + " on " + appointment.getAppointmentDate() +
                " at " + appointment.getAppointmentTime();
        sendNotification(appointment.getDoctor().getEmail(), doctorMessage);

        String patientMessage = "You have an appointment with Dr. " + appointment.getDoctor().getLastName() +
                " on " + appointment.getAppointmentDate() + " at " + appointment.getAppointmentTime();
        sendNotification(appointment.getPatient().getEmail(), patientMessage);
    }
}

