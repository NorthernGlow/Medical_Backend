package com.example.medical_backend.models.dto;

import com.example.medical_backend.models.Hospital;
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

    public HospitalDTO(Hospital hospital) {
        this.id = hospital.getId();
        this.name = hospital.getHospitalName();
        this.region= hospital.getRegion();
        this.district= hospital.getDistrict();
        this.city= hospital.getCity();
        this.street= hospital.getStreet();
        this.numberBuild= hospital.getNumberBuild();
    }
}
