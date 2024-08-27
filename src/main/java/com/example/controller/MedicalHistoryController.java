// src/main/java/com/example/controller/MedicalHistoryController.java
package com.example.controller;

import com.example.entity.MedicalHistory;
import com.example.service.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medical-history")
public class MedicalHistoryController {

    @Autowired
    private MedicalHistoryService medicalHistoryService;

    @GetMapping
    public List<MedicalHistory> getAllHistories() {
        return medicalHistoryService.getAllHistories();
    }

    @GetMapping("/patient/{patientId}")
    public List<MedicalHistory> getHistoriesByPatientId(@PathVariable Long patientId) {
        return medicalHistoryService.getHistoriesByPatientId(patientId);
    }

    @PostMapping
    public MedicalHistory createHistory(@RequestBody MedicalHistory history) {
        return medicalHistoryService.saveHistory(history);
    }

    @DeleteMapping("/{id}")
    public void deleteHistory(@PathVariable Long id) {
        medicalHistoryService.deleteHistory(id);
    }
}
