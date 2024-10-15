package fr.uphf.Questease.Model;

import fr.uphf.Questease.Controller.Lobby;

import java.util.ArrayList;

public class Serveur {
    ArrayList<Lobby> lobby;

    public Serveur() {
        this.lobby = new ArrayList<>();
    }

    public void addLobby(Utilisateur user){
        Lobby nLobby = new Lobby(user);
        this.lobby.add(nLobby);
    }

    public void run(int nbrLoby){
        if(this.lobby.get(nbrLoby) != null && this.lobby.get(nbrLoby).Ready()){
            Thread t1 = new Thread(() -> {this.lobby.get(nbrLoby).Lauch();});

        }

    }
}
