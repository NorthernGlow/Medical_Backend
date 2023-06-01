package com.example.medical_backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String hospitalName;
    private String region;
    private String district;
    private String city;
    private String street;
    private String numberBuild;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "hospital_doctor",
//            joinColumns = @JoinColumn(name = "hospital_id"),
//            inverseJoinColumns = @JoinColumn(name = "doctor_id")
//    )
//    private List<Doctor> doctors;


}
