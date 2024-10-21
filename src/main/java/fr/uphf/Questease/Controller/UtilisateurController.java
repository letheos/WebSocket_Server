package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.Utilisateur;
import fr.uphf.Questease.Repository.UtilisateurRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller du repositoire d'Utilisateur
 */
@RestController
@RequestMapping("")
public class UtilisateurController {

    /**
     * Le repositoire d'Utilisateur
     */
    private final UtilisateurRepository UtilRepository;

    /**
     * Le constructeur d'UtilisateurController
     * @param utililisateurRepository Le repositoire d'Utilisateur
     */
    public UtilisateurController(UtilisateurRepository utililisateurRepository) {
        UtilRepository = utililisateurRepository;
    }

    /**
     * Méthode Get pour récupérer un Utilisateur via son nom
     * @param nameUtil Le nom de l'Utilisateur à trouver
     * @return L'Utilisateur à trouver
     */
    @GetMapping("/{idUtil}")
    public ResponseEntity<Iterable<Utilisateur>> getUserByName(@PathVariable String nameUtil){
        return ResponseEntity.ok(UtilRepository.findUtilByName(nameUtil));
    }

    /**
     * Méthode Post permettant d'ajouter un Utilisateur à la base de donnée
     * @param Util L'utilisateur à ajouté à la base de donnée
     */
    @PostMapping("/{idUtil}")
    public void PostUser(@PathVariable Utilisateur Util){
        UtilRepository.save(Util);
    }

    /**
     * Méthode Update permettant de mettre à jour un Utilisateur dans la base de donnée
     * @param IdUser L'id de L'Utilisateur à mettre à jour
     * @param Util L'utilisateur qui sera mis à jour
     */
    @PatchMapping("/{idUtil}")
    public void UpdateUser(Long IdUser, @PathVariable Utilisateur Util){
        UtilRepository.deleteById(IdUser);
        UtilRepository.save(Util);
    }

    /**
     * Méthode Delete permettant de supprimer un Utilisateur de la base de donnée
     * @param Util L'Utilisateur à supprimer de la base de donnée
     */
    @DeleteMapping("/{idUtil}")
    public void DeleteUser(@PathVariable Utilisateur Util){
        UtilRepository.delete(Util);
    }

}
