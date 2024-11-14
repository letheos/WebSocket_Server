package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.Resultat;
import fr.uphf.Questease.Repository.ResultatRepository;
import fr.uphf.Questease.Service.ResultatServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller du repositoire de Resultat
 */
@RestController
@RequestMapping("/resultat")
public class ResultatController {

    /**
     * Implémentation du service permettant d'accéder au repositoire
     */
    private final ResultatServiceImpl repo;

    /**
     * Constructeur de la classe RésultatController
     * @param repo Le repositoire de la classe
     */
    public ResultatController(ResultatServiceImpl repo) {
        this.repo = repo;
    }

    @GetMapping("/{idPartie}")
    public Optional<Resultat> getResultatByIdpartie(@PathVariable Long idPartie) {
        return repo.FetchOne(idPartie);
    }

    @PostMapping("/{idPartie}")
    public void PostResultat(@PathVariable Long idPartie, @RequestBody Resultat R) {
        repo.SaveResultat(R);
    }

    @PatchMapping("/{idPartie}")
    public void UpdateResultat(@PathVariable Long idPartie, @RequestBody Resultat R) {
        repo.UpdateResultat(R, idPartie);
    }

    @DeleteMapping("/{idPartie}")
    public void DeleteResultat(@PathVariable Long idPartie) {
        repo.DeleteResultat(idPartie);
    }

    @GetMapping("")
    public List<Resultat> GetAllResultatGet() {
        return repo.FetchResultatList();
    }

    @PostMapping("")
    public List<Resultat> GetAllResultatPost() {
        return repo.FetchResultatList();
    }
}
