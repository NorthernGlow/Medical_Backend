package com.example.medical_backend.models.dto;

import com.example.medical_backend.models.Gender;
import com.example.medical_backend.models.Hospital;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DoctorDTO {
    private int id;

    private String name;
    private String surname;
    private String patronymic;
//    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date birthDay;
    private String photo;
    private String email;
    private String password;
    private HospitalDTO hospital;
}
