package com.olxsample.technosantraolx.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table (name = "district")
@Data
@AllArgsConstructor
public class District {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String thumbnail;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    private Long CityId;
    private Long CityProvinceId;
    private Long CityProvinceCountryId;

}
