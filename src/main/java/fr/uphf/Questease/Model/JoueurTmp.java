package fr.uphf.Questease.Model;

import jakarta.persistence.*;
import java.util.Set;
import fr.uphf.Questease.Model.Lobby;

/**
 * Représente l'utilisateur qui jour aux différents jeux
 */
@Entity
@Table(name = "JoueurTmp")
public class JoueurTmp {

    /**
     * L'id de l'utilisateur
     */
    @Id
    @GeneratedValue
    @Column(name = "idJoueur")
    private Long id;

    /**
     * Le pseudonyme de l'utilisateur
     */
    @Column(name = "pseudo",nullable = false, unique = true)
    private String pseudo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idLobby", referencedColumnName = "idLobby")
    private Lobby lobby;

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
}
