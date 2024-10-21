package fr.uphf.Questease.Model;

import fr.uphf.Questease.Controller.Lobby;

import java.util.ArrayList;

/**
 * TODO
 */
public class Serveur {

    /**
     * TODO
     */
    ArrayList<Lobby> lobby;

    /**
     * TODO
     */
    public Serveur() {
        this.lobby = new ArrayList<>();
    }

    /**
     * TODO
     * @param user
     */
    public void addLobby(Utilisateur user){
        Lobby nLobby = new Lobby(user);
        this.lobby.add(nLobby);
    }

    /**
     * TODO
     * @param nbrLoby
     */
    public void run(int nbrLoby){
        if(this.lobby.get(nbrLoby) != null && this.lobby.get(nbrLoby).Ready()){
            Thread t1 = new Thread(() -> {this.lobby.get(nbrLoby).Lauch();});

        }

    }
}
