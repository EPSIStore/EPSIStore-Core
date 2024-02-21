package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "rate")
public class Rate {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_evaluation")
    private Evaluation evaluation;
}
