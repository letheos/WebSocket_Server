package fr.uphf.Questease.Controller;
//TODO créer un socket avec les deux joueurs quand on créer un lobby
import fr.uphf.Questease.Model.JoueurTmp;
import fr.uphf.Questease.Model.Lobby;
import fr.uphf.Questease.Service.JoueurTmpServiceImpl;
import fr.uphf.Questease.Service.LobbyServiceImpl;
import fr.uphf.Questease.Service.ResultatServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/Lobby")
public class LobbyController {
    private final LobbyServiceImpl repo;
    private final JoueurTmpServiceImpl repojoueur;
    public LobbyController(LobbyServiceImpl repo, JoueurTmpServiceImpl repojoueur) {
        this.repo = repo;
        this.repojoueur = repojoueur;
    }

    @GetMapping("/Connexion")
    public String Connexion(JoueurTmp j2) {
        return "Connexion";
    }

    @GetMapping("/Creation/{id}")
    public void Creation(@PathVariable Long idJ1) {
        //TODO faire une fonction qui prends un id est renvoie un bool s'il existe
        if(repojoueur.Exist(idJ1)) {
            Optional<JoueurTmp> joueur =  repojoueur.FetchOne(idJ1);
            this.repo.SaveLobby(new Lobby(joueur.get()));
        }

    }

    @GetMapping("/Ajout/{id}")
    public void Ajout(@PathVariable JoueurTmp j2) {}
}
