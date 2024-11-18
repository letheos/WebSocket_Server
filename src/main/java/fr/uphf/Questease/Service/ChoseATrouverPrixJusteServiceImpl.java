package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.ChoseATrouverPrixJuste;
import fr.uphf.Questease.Repository.ChoseATrouverPrixJusteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implémentation de l'interface de ChoseATrouverPrixJuste
 */
@Service
public class ChoseATrouverPrixJusteServiceImpl implements ChoseATrouverPrixJusteService{

    /**
     * Repositoire de la classe ChoseATrouverPrixJuste
     */
    @Autowired
    private ChoseATrouverPrixJusteRepository repo;

    /**
     * Constructeur de la classe ChoseATrouverPrixJusteServiceImpl
     * @param infoSecu l'élément à sauvegarder
     * @return Un élément du prix juste
     */
    @Override
    public ChoseATrouverPrixJuste SaveChose(ChoseATrouverPrixJuste infoSecu) {
        return repo.save(infoSecu);
    }

    /**
     * Méthode permettant de récupérer la liste de tout les éléments
     * @return la liste de tout les éléments
     */
    @Override
    public List<ChoseATrouverPrixJuste> FetchChoseList() {
        return (List<ChoseATrouverPrixJuste>)repo.findAll();
    }

    /**
     * Méthode permettant de récupérer tton bon gros TODO
     * @param id L'id du
     * @return
     */
    @Override
    public Optional<ChoseATrouverPrixJuste> ReadChose(Long id) {
        return repo.findById(id);
    }

    /**
     * Méthode permettant de mettre à jour un élément du prix juste dans la base de donnée
     * @param chose La chose qui mettra à jour
     * @param choseId L'id de la chose qui sera mis à jour
     * @return La chose mise à jour
     */
    @Override
    public ChoseATrouverPrixJuste UpdateChose(ChoseATrouverPrixJuste chose, Long choseId) {
        repo.deleteById(choseId);
        return repo.save(chose);
    }

    /**
     * Méthode permettant de supprimer un élément dans la base de donnée
     * @param choseId L'id de la chose à supprimer
     */
    @Override
    public void DeleteChose(Long choseId) {
        repo.deleteById(choseId);
    }
}
