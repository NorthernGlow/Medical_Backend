package com.example.medical_backend.services;

import com.example.medical_backend.dao.PatientDAO;
import com.example.medical_backend.models.Doctor;
import com.example.medical_backend.models.Patient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientService {

    private PatientDAO patientDAO;

    public void savePatient(Patient patient) throws Exception {
        if (patient != null) {
            patientDAO.save(patient);
        } else {
            throw new Exception();
        }
    }

    public int authorization(Patient patient){
        Patient pat = patientDAO.findByEmailAndPassword(patient.getEmail(), patient.getPassword());
        if (pat != null){
            return pat.getId();
        }
        return 0;
    }
}
