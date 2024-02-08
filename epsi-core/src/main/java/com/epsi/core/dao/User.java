package com.epsi.core.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "pwd")
    private String password;

    @Column(name = "name_role")
    private String name_role;

    @Column(name = "id_customer")
    private Integer customer;

    public User() {

    }
    public User(int id, String email, String password, String name_role, Integer customer) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name_role = name_role;
        this.customer = customer;
    }
}
