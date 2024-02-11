package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "fidelity_reward")
public class FidelityReward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fidelity_reward")
    private Long idFidelityReward;

    @Column(name = "fidelity_point")
    private int fidelityPoint;

    @Column(name = "recompense")
    private String recompense;
}
