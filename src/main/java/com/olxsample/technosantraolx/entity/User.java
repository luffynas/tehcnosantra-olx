package com.olxsample.technosantraolx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity
//@Table(name = "user")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "user_id")
    private Long id;

    //@Column(name = "name")
    private String name;
    //@Column(name = "email")
    private String email;
    //@Column(name = "password")
    private String password;

}
