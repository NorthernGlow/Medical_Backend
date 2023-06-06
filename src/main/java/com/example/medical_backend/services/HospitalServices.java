package com.example.medical_backend.services;

import com.example.medical_backend.dao.HospitalDAO;
import com.example.medical_backend.models.Hospital;
import com.example.medical_backend.models.dto.HospitalDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HospitalServices {
    private HospitalDAO hospitalDAO;

    public List<Hospital> getAllHospital(){
        return hospitalDAO.findAll();
    }

    public Hospital getHospitalById(int id){
        return hospitalDAO.findById(id).get();
    }
}
