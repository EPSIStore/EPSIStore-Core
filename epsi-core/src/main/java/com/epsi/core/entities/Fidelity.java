package com.epsi.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="fidelity")
public class Fidelity {
    @Id
    @GeneratedValue
    @Column(name="id_fidelity")
    private Long idFidelity;

    @Column(name="fidelity_point")
    private Long fidelityPoint;

    @Column(name="update_date")
    private Date updateDate;

    @Column(name="content")
    private String content;

    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}
