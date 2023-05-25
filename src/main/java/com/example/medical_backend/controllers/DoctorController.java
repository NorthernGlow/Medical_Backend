package com.example.medical_backend.controllers;

import com.example.medical_backend.models.Doctor;
import com.example.medical_backend.models.dto.DoctorDTO;
import com.example.medical_backend.services.DoctorServices;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin
public class DoctorController {
    private DoctorServices doctorServices;
    private ModelMapper modelMapper;

    @PostMapping("registration")
    public int saveDoctor(@RequestBody @Validated Doctor doctor) throws Exception {
        return doctorServices.saveDoctor(doctor);
    }

    @GetMapping("doctor/{doctorId}")
    public DoctorDTO getDoctorById(@PathVariable int doctorId){
        Doctor doctor = doctorServices.getDoctorById(doctorId);
        DoctorDTO map = modelMapper.map(doctor, DoctorDTO.class);
        return map;
    }
}
