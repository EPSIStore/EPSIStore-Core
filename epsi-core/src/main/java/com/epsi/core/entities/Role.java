package com.epsi.core.entities;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "name_role")
    private String roleName;

    @Column(name = "priority_index")
    private int priorityIndex;

}

