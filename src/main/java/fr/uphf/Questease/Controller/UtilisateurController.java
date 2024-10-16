package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.Utilisateur;
import fr.uphf.Questease.Repository.UtililisateurRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class UtilisateurController {

    private final UtililisateurRepository UtilRepository;

    public UtilisateurController(UtililisateurRepository utililisateurRepository) {
        UtilRepository = utililisateurRepository;
    }

    @GetMapping("/{idUtil}")
    public ResponseEntity<Iterable<Utilisateur>> getUtilisateurById(@PathVariable int idUtil){
        return ResponseEntity.ok(UtilRepository.findUtilByName(idUtil));
    }

    //Post, Update et Delete à faire


}
