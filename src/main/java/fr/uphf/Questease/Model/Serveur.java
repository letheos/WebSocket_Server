package fr.uphf.Questease.Model;

import fr.uphf.Questease.Controller.Lobby;

import java.util.ArrayList;

/**
 * Classe représentant le serveur de l'application
 */
public class Serveur {

    /**
     * La "salle de jeu" ou deux joueurs peuvent lancé une partie
     */
    ArrayList<Lobby> lobby;

    /**
     * Constructeur de la classe Serveur
     */
    public Serveur() {
        this.lobby = new ArrayList<>();
    }

    /**
     * Ajoute un lobby composé d'un utilisateur
     * @param user L'utilisateur qui crée le lobby
     */
    public void addLobby(Utilisateur user){
        Lobby nLobby = new Lobby(user);
        this.lobby.add(nLobby);
    }

    /**
     * Lance la partie avec un certain nombre de lobby
     * @param nbrLobby Le nombre de lobby au lancement de la partie
     */
    public void run(int nbrLobby){
        if(this.lobby.get(nbrLobby) != null && this.lobby.get(nbrLobby).Ready()){
            Thread t1 = new Thread(() -> {this.lobby.get(nbrLobby).Lauch();});

        }

    }
}
