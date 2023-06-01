package com.example.medical_backend.dao;

import com.example.medical_backend.models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalDAO extends JpaRepository<Hospital, Integer> {
}
