package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.ChoseATrouverPrixJuste;
import fr.uphf.Questease.Model.InfoSecu;

import java.util.List;
import java.util.Optional;

/**
 * Interface du service de ChoseATrouverPrixJuste
 */
public interface ChoseATrouverPrixJusteService {

    /**
     * Méthode permettant de sauvegarder l'un des élément du prix juste
     * @param chose l'élément à sauvegarder
     * @return l'élément à sauvegarder
     */
    ChoseATrouverPrixJuste SaveChose(ChoseATrouverPrixJuste chose);

    /**
     * Méthode permettant de récupérer la liste de tout les éléments
     * @return la liste de tout les éléments
     */
    List<ChoseATrouverPrixJuste> FetchChoseList();

    /**
     * Méthode permettant de récupérer tton bon gros TODO
     * @param id L'id du
     * @return
     */
    Optional<ChoseATrouverPrixJuste> ReadChose(Long id);

    /**
     * Méthode permettant de mettre à jour un élément du prix juste dans la base de donnée
     * @param chose La chose qui mettra à jour
     * @param choseId L'id de la chose qui sera mis à jour
     * @return La chose mise à jour
     */
    ChoseATrouverPrixJuste UpdateChose(ChoseATrouverPrixJuste chose, Long choseId);

    /**
     * Méthode permettant de supprimer un élément dans la base de donnée
     * @param choseId L'id de la chose à supprimer
     */
    void DeleteChose(Long choseId);
}
