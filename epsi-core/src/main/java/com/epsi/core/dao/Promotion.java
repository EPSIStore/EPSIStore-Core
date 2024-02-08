package com.epsi.core.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@Table(name = "promotion")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promotion")
    private int id;

    @Column(name = "datebegin")
    private Date datebegin;

    @Column(name = "dateend")
    private Date dateend;

    @Column(name = "amount")
    private Integer amout;

    @Column(name = "ispourcent")
    private Boolean isPourcent;

    @Column(name = "id_promotion_type")
    private Integer typePromo;

    @Column(name = "id_product")
    private Integer idProduit;
}
