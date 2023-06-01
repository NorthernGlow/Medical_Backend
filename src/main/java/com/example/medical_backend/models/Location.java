package com.example.medical_backend.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@ToString
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "location",cascade = CascadeType.ALL)
    @ToString.Exclude
    private Patient patient;

    private String name;
    private String region;
    private String district;
    private String city;
    private String street;
    private String numberBuild;
}
