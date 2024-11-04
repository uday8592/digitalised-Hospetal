package com.hospital.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String specialization;
    private String qualification;
    private String licenseNumber;
}