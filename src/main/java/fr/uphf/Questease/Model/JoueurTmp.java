package fr.uphf.Questease.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "JoueurTmp")
public class JoueurTmp {
    /**
     * L'id de l'utilisateur
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idJoueur")
    private Long id;
    /**
     * Le pseudonyme de l'utilisateur
     */
    @Column(name = "pseudo", nullable = false, unique = true)
    private String pseudo;

    @ManyToOne
    @JoinColumn(name = "idLobby")
    private Lobby lobby;

    // Constructeur avec pseudonyme
    public JoueurTmp(String pseudo) {
        this.pseudo = pseudo;
    }

    // Constructeur par défaut
    public JoueurTmp() {}

    /**
     * Le getter de l'id de l'utilisateur
     * @return L'id de l'utilisateur
     */
    public Long getId() {
        return id;
    }
    /**
     * Le setter de l'id de l'utilisateur
     * @param id L'id de l'utilisateur
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Lobby getLobby() {
        return lobby;
    }

    public void setLobby(Lobby lobby) {
        this.lobby = lobby;
    }
}
