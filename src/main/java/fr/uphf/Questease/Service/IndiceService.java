package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Model.InfoSecu;
import fr.uphf.Questease.Repository.IndiceRepository;

import java.util.List;
import java.util.Optional;

/**
 * Interface du service d'Indice
 */
public interface IndiceService {

    /**
     * Méthode permettant de sauvegarder un indice en base de donnée
     * @param indice L'indice à sauvegarder
     * @return L'indice à sauvegarder
     */
    Indice SaveIndice(Indice indice);

    /**
     * Méthode permettant de récupérer la liste de tout les indices
     * @return La liste d'indice
     */
    List<Indice> FetchIndiceList();

    /**
     * Méthode permettant de récupérer un indice via son id
     * @param id L'id de l'indice à récupérer
     * @return L'indice à récupérer
     */
    Optional<Indice> FetchIndice(Long id);

    /**
     * Méthode permettant de mettre à jour un indice dans la base de donnée
     * @param indice L'indice qui sera mis à jour
     * @param indiceId L'id de l'indice à mettre à jour
     * @return L'indice mis à jour
     */
    Indice UpdateIndice(Indice indice, Long indiceId);

    /**
     * Méthode permettant de supprimer un indice dans la base de donnée
     * @param indiceId L'id de l'indice à mettre à jour
     */
    void deleteIndice(Long indiceId);
}
