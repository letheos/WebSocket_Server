package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.Resultat;
import fr.uphf.Questease.Repository.ResultatRepository;
import fr.uphf.Questease.Service.ResultatServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Controller du repositoire de Resultat
 */
@RestController
@RequestMapping
public class ResultatController {

    /**
     * Le repositoire de Resultat
     */
    private final ResultatServiceImpl repo;

    /**
     * Le constructeur de ResultatController
     * @param repo Le repositoire de Resultat
     */
    public ResultatController(ResultatServiceImpl repo) {
        this.repo = repo;
    }

    /**
     * Méthode Get permettant de récupérer le Résultat en partant de l'id de sa partie
     * @param idpartie L'id de la partie
     * @return Le Resultat de la partie
     */
    @GetMapping("/{idPartie}")
    public Optional<Resultat> getResultatByIdpartie(@PathVariable Long idpartie) {
        return repo.FetchOne(idpartie);
    }

    /**
     * Méthode Post permettant d'ajouter un Résultat dans la base de donnée
     * @param R Le résultat à ajouter dans la base de donnée
     */
    @PostMapping("/{idPartie}")
    public void PostResultat(@PathVariable Resultat R) {
        repo.SaveResultat(R);
    }

    /**
     * Méthode Update permettant de mettre à jour un Résultat dans la base de donnée
     * @param Idpartie L'id du Résultat à mettre à jour
     * @param R Le Résultat qui sera mis à jour
     */
    @PatchMapping("/{iPartie}")
    public void UpdateResultat(Long Idpartie, @PathVariable Resultat R) {
        repo.DeleteResultat(Idpartie);
        repo.SaveResultat(R);
    }

    /**
     * Méthode Delete permettant de supprimer un Résultat de la base de donnée
     * @param R Le résultat à supprimer
     */
    @DeleteMapping("/{idPartie}")
    public void DeleteResultat(@PathVariable Long idRes) {
        repo.DeleteResultat(idRes);
    }
}