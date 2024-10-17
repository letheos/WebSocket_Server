package fr.uphf.Questease.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Indice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idIndice")
    private int id;

    @Column(name = "indice",unique=true)
    private String hint;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL)
    private List<MotCryptex> motCryptexList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL)
    private List<MotCryptex> motPenduList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL)
    private List<MotCryptex> sonList;


    public Indice() {}

    public Indice(int id, String hint) {
        this.id = id;
        this.hint = hint;
    }

    public int getId() {
        return id;
    }

    public String getHint() {
        return hint;
    }
}
