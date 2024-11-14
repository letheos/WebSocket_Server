package fr.uphf.Questease.Model;

import jakarta.persistence.*;

/**
 * Représente le mot à trouver lors du jeu du Cryptex
 */
@Entity
@Table(name = "motCryptex")
public class MotCryptex {

    /**
     * L'id du mot à trouver lors du Cryptex
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idMotCryptex")
    private Long id;

    /**
     * Le mot à trouver lors du Cryptex
     */
    @Column(name = "mot",unique=true, nullable = false)
    private String mot;

    /**
     * TODO
     */
    @Column(name = "diff", nullable = false)
    private int diff;

    /**
     * L'indice lié au mot à trouver lors du Cryptex
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idindice", referencedColumnName = "idindice")
    private Indice indice;

    /**
     * Le getter de l'id d'un mot du cryptex
     * @return L'id d'un mot du cryptex
     */
    public Long getId() {
        return id;
    }

    /**
     * Le getter du texte d'un mot du cryptex
     * @return Le texte d'un mot du cryptex
     */
    public String getMot() {
        return mot;
    }

    /**
     * TODO
     * @return
     */
    public int getDiff() {
        return diff;
    }

    /**
     * Le getter de l'indice lié au mot du cryptex
     * @return L'indice lié au mot du cryptex
     */
    public Indice getIndice() {
        return indice;
    }
}
