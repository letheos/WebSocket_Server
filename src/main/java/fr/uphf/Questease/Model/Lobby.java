package fr.uphf.Questease.Model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Lobby")
public class Lobby {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idLobby")
    private Long id;

    @OneToMany(mappedBy = "lobby", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JoueurTmp> joueurs = new ArrayList<>();


    public Lobby(JoueurTmp host) {
        addJoueur(host);
    }

    private Lobby() {}

    public Long getId() {
        return id;
    }

    public List<JoueurTmp> getJoueurs() {
        return joueurs;
    }

    public void addJoueur(JoueurTmp joueur) {
        if (joueurs.size() >= 2) {
            throw new IllegalArgumentException("Un lobby peut avoir au maximum 2 joueurs.");
        }
        joueur.setLobby(this);
        joueurs.add(joueur);
    }

    public void setJoueurs(List<JoueurTmp> joueurs) {
        if (joueurs.size() > 2) {
            throw new IllegalArgumentException("Un lobby peut avoir au maximum 2 joueurs.");
        }
        this.joueurs = joueurs;
        for (JoueurTmp joueur : joueurs) {
            joueur.setLobby(this);
        }
    }
}
