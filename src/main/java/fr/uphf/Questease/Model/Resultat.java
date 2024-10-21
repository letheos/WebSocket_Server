package fr.uphf.Questease.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "Resultat")
public class Resultat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPartie")
    private Long idPartie;

    @Column(name = "isTresor", nullable = false)
    private boolean isTresor;

    @Column(name = "isCryptex", nullable = false)
    private boolean isCryptex;

    @Column(name = "isPendu", nullable = false)
    private boolean isPendu;

    @Column(name = "isSon", nullable = false)
    private boolean isSon;

    @Column(name = "isprixjuste", nullable = false)
    private boolean isprixjuste;

    @ManyToOne
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateur")  // Clé étrangère vers "utilisateur"
    private Utilisateur utilisateur;


    public Long getIdPartie() {
        return idPartie;
    }

    public boolean isCryptex() {
        return isCryptex;
    }

    public boolean isPendu() {
        return isPendu;
    }

    public boolean isSon() {
        return isSon;
    }

    public boolean isIsprixjuste() {
        return isprixjuste;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public boolean isTresor() {
        return isTresor;
    }

    public void setTresor(boolean tresor) {
        isTresor = tresor;
    }


}
