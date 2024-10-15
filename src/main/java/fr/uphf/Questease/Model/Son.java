package fr.uphf.Questease.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Son")
public class Son {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cheminSon", nullable = false)
    private String cheminSon;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idIndice")
    private Indice Indice;
}
