package com.example.medical_backend.services;

import com.example.medical_backend.dao.DoctorDAO;
import com.example.medical_backend.models.Doctor;
import com.example.medical_backend.models.Hospital;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DoctorServices {
    private DoctorDAO doctorDAO;

    public int saveDoctor(Doctor customer) throws Exception {
        if (customer != null) {
            doctorDAO.save(customer);
            return customer.getId();
        } else {
            throw new Exception();
        }
    }

    public int authorization(Doctor doctor){
        Doctor doc = doctorDAO.findByEmailAndPassword(doctor.getEmail(), doctor.getPassword());
        if (doc != null){
            return doc.getId();
        }
        return 0;
    }

    public Doctor getDoctorById(int id){
        return doctorDAO.findById(id).orElseThrow();
    }

    public void patchHospital(Hospital hospital, int id){
        Doctor doctor = doctorDAO.findById(id).get();
        doctor.setHospital(hospital);
        doctorDAO.save(doctor);
    }
}
