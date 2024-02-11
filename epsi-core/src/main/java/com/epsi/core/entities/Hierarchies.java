package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "hierarchies")
public class Hierarchies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hierarchies")
    private Long idHierarchies;

    @Column(name = "name_category")
    private String nameCategory;

    @ManyToOne
    @JoinColumn(name = "id_hierarchies_1")
    private Hierarchies hierarchies1;

}
