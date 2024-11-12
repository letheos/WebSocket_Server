package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;
import fr.uphf.Questease.Model.Lobby;
import fr.uphf.Questease.Repository.IndiceRepository;
import fr.uphf.Questease.Repository.LobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LobbyServiceImpl implements LobbyService{
    @Autowired
    private LobbyRepository repo;

    @Override
    public Lobby SaveLobby(Lobby lobbyp) {
        return null;
    }

    @Override
    public List<Lobby> FetchLobbyList() {
        return List.of();
    }

    @Override
    public Iterable<Lobby> FetchOne(Lobby lobby) {
        return null;
    }

    @Override
    public Lobby UpdateLobby(Lobby lobby, Long lobbyId) {
        return null;
    }

    @Override
    public void DeleteLobby(Long idLobby) {

    }
}
