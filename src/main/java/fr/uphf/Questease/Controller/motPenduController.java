package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.MotPendu;
import fr.uphf.Questease.Repository.MotPenduRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Controller du repositoire de motPendu
 */
@RestController
@RequestMapping
public class motPenduController {

    /**
     * Le repositoire de motPendu
     */
    private final MotPenduRepository repo;

    /**
     * Le constructeur de la classe motPenduController
     * @param repo le repositoire de motPendu
     */
    public motPenduController(MotPenduRepository repo) {
        this.repo = repo;
    }

    /**
     * Méthode Get permettant de récupérer un mot via son id
     * @param idMot L'id du mot à trouver lors d'un pendu
     * @return Le mot à trouver
     */
    @GetMapping("/{idMotPendu}")
    public Optional<MotPendu> getMotById(@PathVariable Long idMot) {
        return repo.findById(idMot);
    }

    /**
     * Méthode Post permettant d'ajouter un mot à la base de donnée
     * @param M Le mot à ajouter à la base de donnée
     */
    @PostMapping("/{idMotPendu}")
    public void PostMot(@PathVariable MotPendu M) {
        repo.save(M);
    }

    /**
     * Méthode Update permettant de mettre à jour un mot dans la base de donnée
     * @param IdMotPendu L'id du mot à mettre à jour
     * @param M Le mot qui sera mis à jour
     */
    @PatchMapping("/{idMotPendu}")
    public void UpdateMot(Long IdMotPendu, @PathVariable MotPendu M) {
        repo.deleteById(IdMotPendu);
        repo.save(M);
    }

    /**
     * Méthode Delete permettant de supprimer un mot dans la base de donnée
     * @param M Mot dans la base de donnée à supprimer
     */
    @DeleteMapping("/{idMotPendu}")
    public void DeleteMot(@PathVariable MotPendu M) {
        repo.delete(M);
    }
}