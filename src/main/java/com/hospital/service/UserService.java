package com.hospital.service;

import com.hospital.model.User;
import com.hospital.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public User registerUser(User user) {
        if (userRepository.existsByAadharNumber(user.getAadharNumber())) {
            throw new RuntimeException("User already exists with this Aadhar number");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    
    public User getCurrentUser() {
        // Implementation will be added with security context
        return null;
    }
    
    public User getUserByAadhar(String aadharNumber) {
        return userRepository.findByAadharNumber(aadharNumber)
            .orElseThrow(() -> new RuntimeException("User not found"));
    }
}