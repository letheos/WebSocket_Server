package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.JoueurTmp;

public class LobbyOld extends Thread{
    private JoueurTmp user1 = null;
    private boolean estPretUser1 = false;
    private JoueurTmp user2 = null;
    private boolean estPretUser2 = false;

    public LobbyOld(){

    }
    public LobbyOld(JoueurTmp user1){
        this.user1 = user1;
    }

    public void Connexion(JoueurTmp user){
        //verifier la connexion

    }

    public void Connexion(String pseudo){
        //verifier la connexion
    }

    public boolean Ready(){
        return this.user1 != null && this.user2 != null;
    }

    public void RendrePret(JoueurTmp user){
        if(user == this.user1){
            this.estPretUser1 = true;
        } else if(user == this.user2){
            this.estPretUser2 = true;
        }
    }

    public void Lauch(){
        //TODO
        //créer une boucle et fait les jeux à la suite
        //fin de game ajouter le résultat à la bdd
    }
    
}
