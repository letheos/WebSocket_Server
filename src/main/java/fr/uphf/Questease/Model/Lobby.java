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

    @OneToMany
    @JoinColumn(name = "lobby_id") // Foreign key column in the JoueurTmp table
    private List<JoueurTmp> joueurs = new ArrayList<>();

    // Constructors, getters, setters, and other methods

    //pas de constructeur par défault, obligé d'avoir
    public Lobby(JoueurTmp host){
        joueurs.add(host);
    }

    public Lobby() {

    }

    public List<JoueurTmp> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<JoueurTmp> joueurs) {
        if (joueurs.size() > 2) {
            throw new IllegalArgumentException("A lobby can have a maximum of 2 players.");
        }
        this.joueurs = joueurs;
    }
}
