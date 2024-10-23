package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.InfoSecu;
import fr.uphf.Questease.Repository.InfoSecuRepository;
import fr.uphf.Questease.Service.InfoSecuServicelmpl;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Controller du repositoire d'InfoSecu
 */
@RestController
@RequestMapping("/infosecu")
public class InfoSecuController {

    /**
     * Le repositoire d'InfoSecu
     */
    private final InfoSecuServicelmpl repo;

    /**
     * Le constructeur de la classe InfoSecuController
     * @param repo le repositoire d'InfoSecu
     */
    public InfoSecuController(InfoSecuServicelmpl repo) {
        this.repo = repo;
    }

    /**
     * Méthode Get permettant de récupérer les informations privées via l'id de ces infos
     * @param idInfo L'id des informations privées de cet utilisateur
     * @return Les informations privées liées à cet id
     */
    @GetMapping("/idinfoSecu")
    public Optional<InfoSecu> getInfoSecuById(@PathVariable Long idInfo){
        return repo.FetchInfoSecuById(idInfo);
    }

    /**
     * Méthode Post permettant d'ajouter des informations privées à la base de données
     * @param IS Les informations à ajouter à la base de donnée
     */
    @PostMapping("/{idinfoSecu}")
    public void PostInfoSecu(@PathVariable InfoSecu IS){
        repo.saveInfoSecu(IS);
    }

    /**
     * Méthode Update permettant de mettre à jour un set d'informations
     * @param IdinfoSecu L'id des informations à mettre à jour
     * @param IS Les informations qui seront mis à jour
     */
    @PatchMapping("/{idinfoSecu}")
    public void UpdateInfoSecu(Long IdinfoSecu, @PathVariable InfoSecu IS){
        repo.deleteInfoSecu(IdinfoSecu);
        repo.saveInfoSecu(IS);
    }

    /**
     * Méthode Delete permettant de supprimer des informations de la base de donnée
     * @param IS Les informations qui seront supprimées de la base de donnée
     */
    @DeleteMapping("/{idinfoSecu}")
    public void DeleteinfoSecu(@PathVariable InfoSecu IS){
        repo.deleteInfoSecu(IS.getId());
    }
}
