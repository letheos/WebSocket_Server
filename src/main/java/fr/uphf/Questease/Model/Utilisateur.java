package fr.uphf.Questease.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private int Xp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getXp() {
        return Xp;
    }

    public void setXp(int xp) {
        Xp = xp;
    }
}