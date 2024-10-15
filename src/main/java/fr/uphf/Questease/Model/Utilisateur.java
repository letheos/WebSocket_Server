package fr.uphf.Questease.Model;

import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String nom;

    @Column(nullable = false)
    private int Xp;

    @OneToOne(mappedBy = "InfoSecu", cascade = CascadeType.ALL)
    private InfoSecu inf;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUtilisateur", referencedColumnName = "idUtilisateur")
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
