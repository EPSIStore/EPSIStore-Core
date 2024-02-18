package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
class OrdersProductKey implements Serializable {

    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "id_product")
    private int idProduct;
}

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "orders_product")
public class OrdersProduct {
    @EmbeddedId
    OrdersProductKey id;

    @ManyToOne
    @MapsId("idOrder")
    @Column(name = "id_order")
    private Orders idOrder;

    @ManyToOne
    @MapsId("idProduct")
    @Column(name = "id_product")
    private Product idProduct;

    @Column(name = "quantity")
    private int quantity;
}
