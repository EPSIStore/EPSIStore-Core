package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(name="id_user")
    private Long idUser;

    @Column(name="email")
    private String email;

    @Column(name="name_role")
    private String nameRole;

    @OneToOne
    @JoinColumn(name="id_customer")
    private Customer customer;
}
