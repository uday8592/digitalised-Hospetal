package com.hospital.service;

import com.hospital.model.MedicalRecord;
import com.hospital.model.User;
import com.hospital.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService {
    
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;
    
    @Autowired
    private UserService userService;
    
    public List<MedicalRecord> getCurrentUserRecords() {
        User currentUser = userService.getCurrentUser();
        return medicalRecordRepository.findByPatientOrderByDateDesc(currentUser);
    }
    
    public MedicalRecord addMedicalRecord(MedicalRecord record) {
        return medicalRecordRepository.save(record);
    }
    
    public MedicalRecord getRecord(Long recordId) {
        return medicalRecordRepository.findById(recordId)
            .orElseThrow(() -> new RuntimeException("Medical record not found"));
    }
}