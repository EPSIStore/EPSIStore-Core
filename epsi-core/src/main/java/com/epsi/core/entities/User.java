package com.epsi.core.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @Column(name = "email")
    private String email;

    @Column(name = "pwd")
    private String pwd;

    @ManyToOne
    @JoinColumn(name = "name_role")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

}
