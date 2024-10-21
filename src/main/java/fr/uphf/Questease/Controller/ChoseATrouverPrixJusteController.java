package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.ChoseATrouverPrixJuste;
import fr.uphf.Questease.Repository.ChoseATrouverPrixJusteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Controller du repositoire de ChoseATrouverPrixJuste
 */
@RestController
@RequestMapping("")
public class ChoseATrouverPrixJusteController {

    /**
     * Le repositoire de ChoseATrouverPrixJuste
     */
    private final ChoseATrouverPrixJusteRepository repo;

    /**
     * Contructeur de la classe ChoseATrouverPrixJusteController
     * @param repo Le repositoire de la classe ChoseATrouverPrixJuste
     */
    public ChoseATrouverPrixJusteController(ChoseATrouverPrixJusteRepository repo) {
        this.repo = repo;
    }

    /**
     * Méthode Get permettant de récupérer l'un des éléments du prix juste par son id
     * @param idChose L'id de l'élément
     * @return L'élément à récupérer
     */
    @GetMapping("/{idChoseATrouver}")
    public ResponseEntity<Optional<ChoseATrouverPrixJuste>> GetChoseById(@PathVariable Long idChose) {
        return ResponseEntity.ok(repo.findById(idChose));
    }

    /**
     * Méthode Post permettant d'ajouter un élément du Prix Juste à la base de donnée
     * @param C L'élément à ajouter à la base de donnée
     */
    @PostMapping("/{idchoseATrouver}")
    public void PostChose(@PathVariable ChoseATrouverPrixJuste C) {
        repo.save(C);
    }

    /**
     * Méthode Update permettant de mettre à jour un élément de la base de donnée
     * @param idChose L'id de l'élément à mettre à jour
     * @param C L'élément qui remplacera le précedent
     */
    @PatchMapping("/{idchoseATrouver}")
    public void UpdateChoseATrouver(Long idChose, @PathVariable ChoseATrouverPrixJuste C) {
        repo.deleteById(idChose);
        repo.save(C);
    }

    /**
     * Méthode Delete permettant de supprimer un élément à trouver du juste prix
     * @param C L'élément à supprimer de la base de donnée
     */
    @DeleteMapping("/{idChoseATrouver}")
    public void DeleteChose(@PathVariable ChoseATrouverPrixJuste C) {
        repo.delete(C);
    }
}
