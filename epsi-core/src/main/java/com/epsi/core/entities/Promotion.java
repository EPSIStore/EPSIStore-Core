package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promotion")
    private int idPromotion;

    @Column(name = "date_begin")
    private Date dateBegin;

    @Column(name = "date-end")
    private Date dateEnd;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "ispourcent")
    private Boolean isPourcent;

    @ManyToOne
    @JoinColumn(name = "id_promotion_type")
    private TypePromotion typePromotion;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
}
