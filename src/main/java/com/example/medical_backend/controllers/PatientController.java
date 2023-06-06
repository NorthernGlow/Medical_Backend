package com.example.medical_backend.controllers;

import com.example.medical_backend.models.Doctor;
import com.example.medical_backend.models.Patient;
import com.example.medical_backend.services.PatientService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@CrossOrigin
public class PatientController {

    private PatientService patientService;
    private ModelMapper modelMapper;

    @PostMapping("createPatient")
    public void savePatient(@RequestBody @Validated Patient patient) throws Exception {
        patientService.savePatient(patient);
    }

    @PostMapping("authorizationPatient")
    public int authorization(@RequestBody Patient patient) {
        return patientService.authorization(patient);
    }
}
