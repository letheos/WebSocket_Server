package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;
import fr.uphf.Questease.Model.Lobby;

import java.util.List;

public interface LobbyService {

    //Lobby SaveLobby(JoueurTmp joueurTmp);
    Lobby SaveLobby(Lobby lobby);

    List<Lobby> FetchLobbyList();

    Iterable<Lobby> FetchOne(Lobby lobby);

    Lobby UpdateLobby(Lobby lobby, Long lobbyId);

    void DeleteLobby(Long idLobby);
}

