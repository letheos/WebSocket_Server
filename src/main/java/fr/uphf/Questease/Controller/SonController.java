package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.Son;
import fr.uphf.Questease.Repository.SonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Controller du repositoire de Son
 */
@RestController
@RequestMapping
public class SonController {

    /**
     * Le repositoire de Son
     */
    private final SonRepository repo;

    /**
     * Le constructeur de SonController
     * @param repo Le repositoire de Son
     */
    public SonController(SonRepository repo) {
        this.repo = repo;
    }

    /**
     * Méthode Get permettant de récupérer un Son via son id
     * @param idSon L'id du son à récupérer
     * @return Le son à récupérer
     */
    @GetMapping("/idSon")
    public Optional<Son> getSonById(@PathVariable Long idSon) {
        return repo.findById(idSon);
    }

    /**
     * Méthode Post permettant d'ajouter un Son à la base de donnée
     * @param S
     */
    @PostMapping("/{idSon}")
    public void PostSon(@PathVariable Son S) {
        repo.save(S);
    }


    /**
     * Méthode Update permettant de mettre à jour un Son dans la base de donnée
     * @param IdSon L'id du Son à mettre à jour
     * @param S Le son qui sera mis à jour
     */
    @PatchMapping("/{idSon}")
    public void UpdateSon(Long IdSon, @PathVariable Son S) {
        repo.deleteById(IdSon);
        repo.save(S);
    }

    /**
     * Méthode Delete permettant de supprimer un Son dans la base de donnée
     * @param S Le son à supprimer
     */
    @DeleteMapping("/{idSon}")
    public void DeleteSon(@PathVariable Son S) {
        repo.delete(S);
    }
}
