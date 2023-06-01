package com.example.medical_backend.dao;

import com.example.medical_backend.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDAO extends JpaRepository<Doctor, Integer> {
    public Doctor findByEmailAndPassword(String email, String password);
}
