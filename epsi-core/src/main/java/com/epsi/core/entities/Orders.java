package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "status")
    private String status;

    @Column(name = "address")
    private String address;

    @Column(name = "payment_method")
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @OneToMany(mappedBy = "ordersProduct")
    private Set<OrdersProduct> ordersProduct;
}
