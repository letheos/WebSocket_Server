package fr.uphf.Questease.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Son")
public class Son {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSon")
    private Long id;

    @Column(name = "cheminSon", nullable = false)
    private String cheminSon;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idindice", referencedColumnName = "idindice")
    private Indice indice;
}
