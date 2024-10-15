package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.Utilisateur;
import fr.uphf.Questease.Repositery.UtilRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class Util_Controller {

    private final UtilRepository UtilRepository;

    public Util_Controller(fr.uphf.Questease.Repositery.UtilRepository utilRepository) {
        UtilRepository = utilRepository;
    }

    @GetMapping("/{idUtil}")
    public ResponseEntity<Iterable<Utilisateur>> getUtilisateurById(@PathVariable int idUtil){
        return ResponseEntity.ok(UtilRepository.findUtilByName(idUtil));
    }

    //Post, Update et Delete à faire


}
