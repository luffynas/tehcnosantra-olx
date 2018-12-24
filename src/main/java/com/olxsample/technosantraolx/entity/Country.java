package com.olxsample.technosantraolx.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table (name = "country")
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "country_code")
    private String countryCode;
    @Column(name = "iso_code")
    private String isoCode;
    @Column(name = "currency_code_a")
    private String currencyCodeA;
    @Column(name = "currency_code_n")
    private String currencyCodeN;
    @Column(name = "currency_name")
    private String currencyName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "country")
    public List<Province> provinces;

}
