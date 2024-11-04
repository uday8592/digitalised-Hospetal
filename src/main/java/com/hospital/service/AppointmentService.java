package com.hospital.service;

import com.hospital.model.Appointment;
import com.hospital.model.User;
import com.hospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService {
    
    @Autowired
    private AppointmentRepository appointmentRepository;
    
    @Autowired
    private UserService userService;
    
    public Appointment bookAppointment(Appointment appointment) {
        appointment.setPatient(userService.getCurrentUser());
        appointment.setStatus("SCHEDULED");
        return appointmentRepository.save(appointment);
    }
    
    public List<Appointment> getCurrentUserAppointments() {
        User currentUser = userService.getCurrentUser();
        return appointmentRepository.findByPatientAndAppointmentTimeGreaterThanEqual(
            currentUser, 
            LocalDateTime.now()
        );
    }
    
    public void cancelAppointment(Long appointmentId) {
        Appointment appointment = appointmentRepository.findById(appointmentId)
            .orElseThrow(() -> new RuntimeException("Appointment not found"));
        appointment.setStatus("CANCELLED");
        appointmentRepository.save(appointment);
    }
}