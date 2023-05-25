package com.example.medical_backend.services;

import com.example.medical_backend.dao.DoctorDAO;
import com.example.medical_backend.models.Doctor;
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

    public Doctor getDoctorById(int id){
        return doctorDAO.findById(id).orElseThrow();
    }
}
