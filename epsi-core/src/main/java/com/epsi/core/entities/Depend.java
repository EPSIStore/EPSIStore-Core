package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "depend")
public class Depend {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_hierarchies")
    private Hierarchies hierarchies;
}
