package fr.uphf.Questease.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "motPendu")
public class MotPendu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idMotPendu")
    private Long id;

    @Column(name = "mot",unique=true, nullable = false)
    private String mot;

    @Column(name = "diff", nullable = false)
    private int diff;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idindice", referencedColumnName = "idindice")
    private Indice indice;
}
