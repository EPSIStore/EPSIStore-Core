package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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
