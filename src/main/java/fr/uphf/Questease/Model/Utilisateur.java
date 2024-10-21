package fr.uphf.Questease.Model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue
    @Column(name = "idutilisateur")
    private Long id;

    @Column(name = "pseudouser",nullable = false, unique = true)
    private String nom;

    @Column(name = "xp",nullable = false)
    private int Xp;


    @OneToOne(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private InfoSecu infoSecu;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateur")  // Clé étrangère dans la table "resultat"
    private Set<Resultat> resultat;


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
