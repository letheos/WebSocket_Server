package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;
import fr.uphf.Questease.Model.Lobby;

import java.util.List;

public interface LobbyService extends JoueurTmpService {
    JoueurTmp SaveLobby(JoueurTmp joueurTmp);

    List<JoueurTmp> FetchLobbyList();

    Iterable<JoueurTmp> FetchOne(Lobby lobby);

    Lobby UpdateLobby(Lobby lobby, Long lobbyId);

    void DeleteLobby(Long idLobby);
}

