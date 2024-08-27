package com.example.controller;

// src/main/java/com/example/controller/AvailabilityController.java
//package com.example.controller;

import com.example.entity.Availability;
import com.example.service.AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.util.List;

@RestController
@RequestMapping("/api/availabilities")
@CrossOrigin(origins = "http://localhost:3000")
public class AvailabilityController {

    @Autowired
    private AvailabilityService availabilityService;

    @GetMapping
    public List<Availability> getAllAvailabilities() {
        return availabilityService.getAllAvailabilities();
    }

    @GetMapping("/doctor/{doctorId}/day/{dayOfWeek}")
    public List<Availability> getAvailabilitiesByDoctorIdAndDay(@PathVariable Long doctorId, @PathVariable DayOfWeek dayOfWeek) {
        return availabilityService.getAvailabilitiesByDoctorIdAndDay(doctorId, dayOfWeek);
    }

    @PostMapping
    public Availability createAvailability(@RequestBody Availability availability) {
        return availabilityService.saveAvailability(availability);
    }

    @DeleteMapping("/{id}")
    public void deleteAvailability(@PathVariable Long id) {
        availabilityService.deleteAvailability(id);
    }
}
