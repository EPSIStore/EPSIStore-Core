package com.epsi.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="fidelity_reward")
public class FidelityReward{
    @Id
    @GeneratedValue
    @Column(name="id_fidelity_reward")
    private Long idFidelityReward;

    @Column(name="fidelity_point")
    private Long fidelityPoint;

    @Column(name="reward")
    private String reward;
}
