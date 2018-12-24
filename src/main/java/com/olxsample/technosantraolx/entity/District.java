package com.olxsample.technosantraolx.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table (name = "district")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    private String name;

    @Column(name = "description", columnDefinition = "TEXT", length = 500)
    private String description;
    private String thumbnail;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "city_id")
    public City city;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "district")
    private List<Village> villages;

}
