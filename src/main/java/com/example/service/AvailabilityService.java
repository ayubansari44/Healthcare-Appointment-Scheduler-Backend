package com.example.service;

// src/main/java/com/example/service/AvailabilityService.java
//package com.example.service;

import com.example.entity.Availability;
import com.example.repo.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.List;

@Service
public class AvailabilityService {

    @Autowired
    private AvailabilityRepository availabilityRepository;

    public List<Availability> getAllAvailabilities() {
        return availabilityRepository.findAll();
    }

    public List<Availability> getAvailabilitiesByDoctorIdAndDay(Long doctorId, DayOfWeek dayOfWeek) {
        return availabilityRepository.findByDoctorIdAndDayOfWeek(doctorId, dayOfWeek);
    }

    public Availability saveAvailability(Availability availability) {
        return availabilityRepository.save(availability);
    }

    public void deleteAvailability(Long id) {
        availabilityRepository.deleteById(id);
    }
}

