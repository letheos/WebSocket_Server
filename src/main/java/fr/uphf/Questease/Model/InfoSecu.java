package fr.uphf.Questease.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "infoSecu")
public class InfoSecu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idinfosecu")
    private Long id;

    @Column(name = "psswrd", nullable = false)
    private String mdp;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToOne
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateur")
    private Utilisateur utilisateur;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
