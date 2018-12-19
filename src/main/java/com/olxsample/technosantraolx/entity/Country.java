package com.olxsample.technosantraolx.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "country")
@AllArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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

}
