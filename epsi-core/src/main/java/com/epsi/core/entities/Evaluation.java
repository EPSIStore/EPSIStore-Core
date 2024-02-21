package com.epsi.core.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluation")
    private Long idEvaluation;

    @Column(name = "rate")
    private int rate;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

}
