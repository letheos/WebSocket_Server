package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.Utilisateur;
import fr.uphf.Questease.Repository.UtilisateurRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class UtilisateurController {

    private final UtilisateurRepository UtilRepository;

    public UtilisateurController(UtilisateurRepository utililisateurRepository) {
        UtilRepository = utililisateurRepository;
    }

    @GetMapping("/{idUtil}")
    public ResponseEntity<Iterable<Utilisateur>> getUserByName(@PathVariable String nameUtil){
        return ResponseEntity.ok(UtilRepository.findUtilByName(nameUtil));
    }

    @PostMapping("/{idUtil}")
    public void PostUser(@PathVariable Utilisateur Util){
        UtilRepository.save(Util);
    }

    @PatchMapping("/{idUtil}")
    public void UpdateUser(Long IdUser, @PathVariable Utilisateur Util){
        UtilRepository.deleteById(IdUser);
        UtilRepository.save(Util);
    }

    @DeleteMapping("/{idUtil}")
    public void DeleteUser(@PathVariable Utilisateur Util){
        UtilRepository.delete(Util);
    }

}
