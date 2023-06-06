package com.example.medical_backend.controllers;

import com.example.medical_backend.models.Hospital;
import com.example.medical_backend.models.dto.HospitalDTO;
import com.example.medical_backend.services.HospitalServices;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class HospitalController {

    private HospitalServices hospitalServices;
    private ModelMapper modelMapper;

    @GetMapping("getAllHospital")
    public List<Hospital> getAllHospital() {
       return hospitalServices.getAllHospital();
    }

    @GetMapping("getHospitalById/{id}")
    public Hospital getHospitalById(@PathVariable int id) {
       return hospitalServices.getHospitalById(id);
    }

}
