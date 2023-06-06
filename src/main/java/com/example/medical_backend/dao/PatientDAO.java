package com.example.medical_backend.dao;

import com.example.medical_backend.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDAO extends JpaRepository<Patient,Integer> {

    public Patient findByEmailAndPassword(String email, String password);
}
