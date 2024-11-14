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
     * Méthode Getter renvoyant le booléan correspondant à une victoire sur le cryptex ou non
     * @return Un booléan correspondant à une victoire sur le cryptex ou non
     */
    public boolean isCryptex() {
        return isCryptex;
    }

    /**
     * Méthode Getter renvoyant le booléan correspondant à une victoire sur le pendu ou non
     * @return Un booléan correspondant à une victoire sur le pendu ou non
     */
    public boolean isPendu() {
        return isPendu;
    }

    /**
     * Méthode Getter renvoyant le booléan correspondant à une victoire sur le jeu du son ou non
     * @return Un booléan correspondant à une victoire sur le jeu du son ou non
     */
    public boolean isSon() {
        return isSon;
    }

    /**
     * Méthode Getter renvoyant le booléan correspondant à une victoire sur le cryptex ou non
     * @return Un booléan correspondant à une victoire sur le prix juste ou non
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
     * Le getter du booléan lié à une victoire ou non de la partie
     * @return Le booléan lié à une victoire ou non de la partie
     */
    public boolean isTresor() {
        return isTresor;
    }

    /**
     * Le setter du trésor de la partie
     * @param tresor Le trésor de la partie
     */
    public void setTresor(boolean tresor) {
        isTresor = tresor;
    }


}
