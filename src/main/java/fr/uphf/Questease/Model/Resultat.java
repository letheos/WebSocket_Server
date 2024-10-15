package fr.uphf.Questease.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "Resultat")
public class Resultat {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private boolean isEpreuve1;

    @Column(nullable = false)
    private boolean isEpreuve2;

    @Column(nullable = false)
    private boolean isEpreuve3;

    @Column(nullable = false)
    private boolean isEpreuve4;

    @Column(nullable = false)
    private boolean isTresor;

    @Column(nullable = false)
    private int idPartie;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public int getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }
}
