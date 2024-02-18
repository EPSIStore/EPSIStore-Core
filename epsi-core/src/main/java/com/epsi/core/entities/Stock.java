package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "stock")
public class Stock {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_shop")
    private Shop shop;

    @Column(name = "quantity")
    private int quantity;
}
