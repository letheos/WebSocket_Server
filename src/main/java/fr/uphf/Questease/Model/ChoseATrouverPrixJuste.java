package fr.uphf.Questease.Model;

import jakarta.persistence.*;

@Entity
@Table(name="choseATrouverPrixJust")
public class ChoseATrouverPrixJuste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idChoseATrouver")
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "cheminImage", nullable = false)
    private String cheminImage;

    @Column(name = "valeur", nullable = false)
    private int valeur;

    public ChoseATrouverPrixJuste() {}

    public ChoseATrouverPrixJuste(Long id, String nom, String cheminImage, int valeur) {
        this.id = id;
        this.nom = nom;
        this.cheminImage = cheminImage;
        this.valeur = valeur;
    }


    public String getNom() {
        return nom;
    }

    public String getCheminImage() {
        return cheminImage;
    }

    public int getValeur() {
        return valeur;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}