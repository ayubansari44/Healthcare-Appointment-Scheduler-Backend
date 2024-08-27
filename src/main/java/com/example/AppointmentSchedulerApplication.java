package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AppointmentSchedulerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppointmentSchedulerApplication.class, args);
		System.out.println("### Welcome to Healthcare Appointment Scheduler app!");
	}

}

