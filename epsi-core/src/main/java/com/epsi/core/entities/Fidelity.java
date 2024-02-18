package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "fidelity")
public class Fidelity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fidelity")
    private Long idFidelity;

    @Column(name = "fidelity_point")
    private int fidelityPoint;

    @Column(name = "update_date")
    private Timestamp updateDate;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
