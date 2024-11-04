package com.hospital.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "medical_records")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private User patient;
    
    @ManyToOne
    private Doctor doctor;
    
    private LocalDateTime date;
    private String diagnosis;
    private String prescription;
    private String notes;
}