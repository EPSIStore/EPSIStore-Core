package com.epsi.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="customers")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name="id_customer")
    private Long id;

    @Column(name="address")
    private String address;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;
}
