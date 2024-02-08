package com.epsi.core.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id;

    @Column(name = "name_product")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "detail")
    private String detail;



    public Product(int id, String name, String description, Integer price, Boolean deleted, String detail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.deleted = deleted;
        this.detail = detail;
    }
}
