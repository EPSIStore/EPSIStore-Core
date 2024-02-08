package com.epsi.core.dao;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "shops")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shop")
    private int id;

    @Column(name = "name_shop")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "country")
    private String country;

    @Column(name = "zipcode")
    private String zipcode;


    public Store(){

    }
    public Store(int id, String name, String address, String phone, String country, String zipcode) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.country = country;
        this.zipcode = zipcode;
    }
}