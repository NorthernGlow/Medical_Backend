package com.example.medical_backend.models.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class HospitalDTO {
    private int id;
    private String name;
    private String region;
    private String district;
    private String city;
    private String street;
    private String numberBuild;
}
