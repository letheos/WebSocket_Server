package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Model.MotCryptex;
import fr.uphf.Questease.Repository.MotCryptexRepository;
import fr.uphf.Questease.Service.MotCryptexServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller de la classe MotCryptex
 */
@RestController
@RequestMapping("/motcryptex")  // Base path to avoid conflicts
public class MotCryptexController {

    /**
     * Service du repositoire de MotCryptex
     */
    private final MotCryptexServiceImpl repo;

    /**
     * Contructeur de la classe MotCryptexController
     * @param repo le service du repositoire de MotCryptex
     */
    public MotCryptexController(MotCryptexServiceImpl repo) {
        this.repo = repo;
    }

    /**
     * Méthode Get permettant de récupérer un mot via son id
     * @param id L'id du mot récupéré
     * @return Le mot récupéré
     */
    @GetMapping("/{id}")
    public Optional<MotCryptex> getMotById(@PathVariable Long id) {
        return repo.FetchMotCryptex(id);
    }

    /**
     * Méthode get permettant de récupérer un mot aléatoire de la base de donnée
     * @return Un mot aléatoire de la base de donnée
     */
    @GetMapping("/random")
    public MotCryptex getRandomWord(){
        List<MotCryptex> liste = repo.FetchMotCryptexList();
        return liste.get((int) (Math.random() * ((liste.size()))));
    }

    /**
     * Méthode Post permettant d'ajouter un mot à la base de donnée
     * @param M Le mot qui sera ajouté à la base de donnée
     */
    @PostMapping("/{idMotCryptex}")
    public void PostIndice(@PathVariable MotCryptex M) {
        repo.SaveMotCryptex(M);
    }

    /**
     * Méthode Update permettant de mettre à jour un mot de la base de donnée
     * @param IdMot L'id du mot qui sera mis à jour
     * @param M Le mot qui sera mis à jour
     */
    @PatchMapping("/{idMotCryptex}")
    public void UpdateMot(Long IdMot, @PathVariable MotCryptex M) {
        repo.deleteMotCryptex(IdMot);
        repo.SaveMotCryptex(M);
    }

    /**
     * Méthode Delete permettant de supprimer un mot de la base de donnée
     * @param M Le mot qui sera supprimé de la base de donnée
     */
    @DeleteMapping("/{idMotCryptex}")
    public void DeleteMot(@PathVariable MotCryptex M) {
        repo.deleteMotCryptex(M.getId());
    }

    @GetMapping("")
    public List<MotCryptex> getMotCryptex() {return repo.FetchMotCryptexList();}

    @PostMapping("")
    public List<MotCryptex> getMotCryptexPost() {return repo.FetchMotCryptexList();}

    @GetMapping("/indice/{idMotCryptex}")
    public Indice GetIndoce(@PathVariable Long idMotCryptex) {
        return repo.GetIndiceWithId(idMotCryptex);
    }

    /**
     * Méthode GET permettant d'ajouter un mot à la base de données via des paramètres
     * @param mot Le mot à ajouter
     * @param diff La difficulté associée au mot
     * @param idIndice L'id de l'indice associé
     * @return Le mot ajouté
     */
    @GetMapping("/add")
    public MotCryptex addMotCryptex(
            @RequestParam String mot,
            @RequestParam int diff,
            @RequestParam(required = false) Long idIndice
    ) {
        // Création d'un objet MotCryptex
        Indice associatedIndice = null;
        if (idIndice != null) {
            associatedIndice = repo.GetIndiceWithId(idIndice); // Assure que l'indice existe
        }

        MotCryptex newMotCryptex = new MotCryptex();
        newMotCryptex.setMot(mot);
        newMotCryptex.setDiff(diff);
        newMotCryptex.setIndice(associatedIndice);

        // Sauvegarde dans la base de données
        return repo.SaveMotCryptex(newMotCryptex);
    }

}