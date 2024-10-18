package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.Resultat;
import fr.uphf.Questease.Repository.ResultatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class ResultatController {

    private final ResultatRepository repo;

    public ResultatController(ResultatRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/{idPartie}")
    public Optional<Resultat> getResultatByIdpartie(@PathVariable Long idpartie) {
        return repo.findById(idpartie);
    }

    @PostMapping("/{idPartie}")
    public void PostResultat(@PathVariable Resultat R) {
        repo.save(R);
    }

    @PatchMapping("/{iPartie}")
    public void UpdateResultat(Long Idpartie, @PathVariable Resultat R) {
        repo.deleteById(Idpartie);
        repo.save(R);
    }

    @DeleteMapping("/{idPartie}")
    public void DeleteResultat(@PathVariable Resultat R) {
        repo.delete(R);
    }
}