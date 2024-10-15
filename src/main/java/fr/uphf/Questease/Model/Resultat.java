package fr.uphf.Questease.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
public class Resultat {

    @Id
    @GeneratedValue
    @Column(name = "idPartie")
    private Long idPartie;

    @Column(name = "isEpreuve1",nullable = false)
    private boolean isEpreuve1;


    @Column(name = "isEpreuve2",nullable = false)
    private boolean isEpreuve2;

    @Column(name = "isEpreuve3",nullable = false)
    private boolean isEpreuve3;

    @Column(name = "isEpreuve4",nullable = false)
    private boolean isEpreuve4;

    @Column(name = "isEpreuve5",nullable = false)
    private boolean isTresor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUtilisateur", referencedColumnName = "idUtilisateur")
    private Utilisateur utilisateur;




    public boolean isEpreuve1() {
        return isEpreuve1;
    }

    public void setEpreuve1(boolean epreuve1) {
        isEpreuve1 = epreuve1;
    }

    public boolean isEpreuve2() {
        return isEpreuve2;
    }

    public void setEpreuve2(boolean epreuve2) {
        isEpreuve2 = epreuve2;
    }

    public boolean isEpreuve3() {
        return isEpreuve3;
    }

    public void setEpreuve3(boolean epreuve3) {
        isEpreuve3 = epreuve3;
    }

    public boolean isEpreuve4() {
        return isEpreuve4;
    }

    public void setEpreuve4(boolean epreuve4) {
        isEpreuve4 = epreuve4;
    }

    public boolean isTresor() {
        return isTresor;
    }

    public void setTresor(boolean tresor) {
        isTresor = tresor;
    }


}
