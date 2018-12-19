package com.olxsample.technosantraolx.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table (name = "village")
@Data
@AllArgsConstructor
public class Village {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String thumbnail;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    private Long disctricId;
    private Long disctricCityId;
    private Long disctricCityProvinceId;
    private Long disctricCityProvinceCountryId;

}
