package com.example.service;

import com.example.entity.MedicalHistory;
import com.example.repo.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalHistoryService {

    @Autowired
    private MedicalHistoryRepository medicalHistoryRepository;

    public List<MedicalHistory> getAllHistories() {
        return medicalHistoryRepository.findAll();
    }

    public List<MedicalHistory> getHistoriesByPatientId(Long patientId) {
        return medicalHistoryRepository.findByPatientId(patientId);
    }

    public MedicalHistory saveHistory(MedicalHistory history) {
        return medicalHistoryRepository.save(history);
    }

    public void deleteHistory(Long id) {
        medicalHistoryRepository.deleteById(id);
    }
}

