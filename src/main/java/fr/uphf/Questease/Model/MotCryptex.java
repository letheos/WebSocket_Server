package fr.uphf.Questease.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "motCryptex")
public class MotCryptex {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idMotCryptex")
    private Long id;

    @Column(name = "mot",unique=true, nullable = false)
    private String mot;

    @Column(name = "diff", nullable = false)
    private int diff;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idindice", referencedColumnName = "idindice")
    private Indice indice;
}
