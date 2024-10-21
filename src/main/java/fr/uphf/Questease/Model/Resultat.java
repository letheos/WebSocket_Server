package fr.uphf.Questease.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

/**
 * Représente la liste des résultat d'une partie de l'utilisateur
 */
@Entity
@Table(name = "Resultat")
public class Resultat {

    /**
     * L'id de la partie auquel sont liés les résultats
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPartie")
    private Long idPartie;

    /**
     * Le booléan représentant si l'utilisateur a battu le jeu au cours de cette partie
     */
    @Column(name = "isTresor", nullable = false)
    private boolean isTresor;

    /**
     * Le booléan représentant si l'utilisateur a battu le mini-jeu du Cryptex
     */
    @Column(name = "isCryptex", nullable = false)
    private boolean isCryptex;

    /**
     * Le booléan représentant si l'utilisateur a battu le mini-jeu du pendu
     */
    @Column(name = "isPendu", nullable = false)
    private boolean isPendu;

    /**
     * Le booléan représentant si l'utilisateur a battu le mini-jeu du devinez le son
     */
    @Column(name = "isSon", nullable = false)
    private boolean isSon;

    /**
     * Le booléan représentant si l'utilisateur a battu le mini-jeu du prix juste
     */
    @Column(name = "isprixjuste", nullable = false)
    private boolean isprixjuste;

    /**
     * L'utilisateur auquel sont lié les résultats
     */
    @ManyToOne
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateur")  // Clé étrangère vers "utilisateur"
    private Utilisateur utilisateur;

    /**
     * Le getter de l'id de la partie
     * @return L'id de la partie
     */
    public Long getIdPartie() {
        return idPartie;
    }

    /**
     * TODO
     * @return
     */
    public boolean isCryptex() {
        return isCryptex;
    }

    /**
     * TODO
     * @return
     */
    public boolean isPendu() {
        return isPendu;
    }

    /**
     * TODO
     * @return
     */
    public boolean isSon() {
        return isSon;
    }

    /**
     * TODO
     * @return
     */
    public boolean isIsprixjuste() {
        return isprixjuste;
    }

    /**
     * Le getter de l'utilisateur lié à la partie
     * @return L'utilisateur lié à la partie
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * TODO
     * @return
     */
    public boolean isTresor() {
        return isTresor;
    }

    /**
     * Le setter du trésor de la partie
     * @param tresor
     */
    public void setTresor(boolean tresor) {
        isTresor = tresor;
    }


}
