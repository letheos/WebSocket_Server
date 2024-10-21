package fr.uphf.Questease.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Indice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idindice")
    private int id;

    @Column(name = "indice",unique=true, nullable=false)
    private String indice;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "indice", cascade = CascadeType.ALL)
    private List<MotCryptex> motCryptexList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "indice", cascade = CascadeType.ALL)
    private List<MotCryptex> motPenduList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "indice", cascade = CascadeType.ALL)
    private List<MotCryptex> sonList;


    public Indice() {}

    public Indice(int id, String indice) {
        this.id = id;
        this.indice = indice;
    }

    public int getId() {
        return id;
    }

    public String getHint() {
        return indice;
    }
}
