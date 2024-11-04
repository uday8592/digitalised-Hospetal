package com.hospital.repository;

import com.hospital.model.MedicalRecord;
import com.hospital.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    List<MedicalRecord> findByPatientOrderByDateDesc(User patient);
}