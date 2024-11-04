package com.hospital.config;

import com.hospital.model.Doctor;
import com.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private DoctorService doctorService;

    @Override
    public void run(String... args) {
        // Add some sample doctors
        Doctor doctor1 = new Doctor();
        doctor1.setName("Dr. John Smith");
        doctor1.setSpecialization("Cardiology");
        doctor1.setQualification("MD, DM");
        doctor1.setLicenseNumber("MED001");
        doctorService.addDoctor(doctor1);

        Doctor doctor2 = new Doctor();
        doctor2.setName("Dr. Sarah Johnson");
        doctor2.setSpecialization("Pediatrics");
        doctor2.setQualification("MD");
        doctor2.setLicenseNumber("MED002");
        doctorService.addDoctor(doctor2);

        Doctor doctor3 = new Doctor();
        doctor3.setName("Dr. Michael Chen");
        doctor3.setSpecialization("Orthopedics");
        doctor3.setQualification("MS, DNB");
        doctor3.setLicenseNumber("MED003");
        doctorService.addDoctor(doctor3);
    }
}