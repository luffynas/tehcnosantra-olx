package com.olxsample.technosantraolx.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLInsert;
import org.hibernate.sql.Insert;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Entity
//@Table (name = "province")
//@Data
//@AllArgsConstructor
public class Province {

//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//
//    private String name;
//
//    @Column(name = "description", columnDefinition = "TEXT", length = 500)
//    private String description;
//
//    private String thumbnail;
//
//    @Column(name = "created_at")
//    private Timestamp createdAt;
//
//    @Column(name = "updated_at")
//    private Timestamp updatedAt;
//
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn (name = "country_id")
//    private Country country;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "province")
//    private List<City> cities;

//    @SQLInsert(sql = "INSERT INTO PROVINCE(name, description) VALUES ('Jawa Timur', 'Jawa Barat')", check = ResultCheckStyle.COUNT)
//    private void insert(){

//    }

}
