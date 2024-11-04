package com.hospital.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private User patient;
    
    @ManyToOne
    private Doctor doctor;
    
    private LocalDateTime appointmentTime;
    private String status;
    private String reason;
}