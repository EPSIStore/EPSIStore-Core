package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "associate")
public class Associate {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_order")
    private Orders order;

    @Column(name = "quantity")
    private int quantity;
}
