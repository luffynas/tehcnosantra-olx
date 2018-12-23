package com.olxsample.technosantraolx.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table (name = "city")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    /*@Column(name = "description", columnDefinition = "TEXT", length = 500)
    private String description;

    private String thumbnail;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "province_id")
    private Province province;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<District> districts;*/
}
