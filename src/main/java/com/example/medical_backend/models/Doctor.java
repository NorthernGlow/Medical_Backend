package com.example.medical_backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String surname;
    private String patronymic;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date birthDay;
    private String photo;
    @Enumerated(EnumType.STRING)
    private Profession profession;
    @Column(unique = true)
    private String email;
    @Size(min = 8)
    private String password;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
//    @JoinTable(
//            name = "hospital_doctor",
//            joinColumns = @JoinColumn(name = "doctor_id"),
//            inverseJoinColumns = @JoinColumn(name = "hospital_id")
//    )
    private Hospital hospital;

    public Doctor(String name, String surname, String patronymic, Gender gender, Date birthDay, Profession profession, String email, String password, Hospital hospital) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthDay = birthDay;
        this.profession= profession;
        this.email = email;
        this.password = password;
        this.hospital = hospital;
    }

    public Doctor(String name, String surname, String patronymic, Gender gender, Date birthDay, String photo, Profession profession, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthDay = birthDay;
        this.photo = photo;
        this.profession = profession;
        this.email = email;
        this.password = password;
    }

    public Doctor(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
