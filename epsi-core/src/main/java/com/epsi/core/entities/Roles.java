package com.epsi.core.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "name_role")
    private String name_role;

    @Column(name = "priority_index")
    private Integer priority_index;
}
