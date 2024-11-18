package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.InfoSecu;

import java.util.List;
import java.util.Optional;

/**
 * Interface du service d'InfoSecu
 */
public interface InfoSecuService {

    /**
     * Méthode permettant de sauvegarder les informations de compte d'un utilisateur en base de donnée
     */
    InfoSecu saveInfoSecu(InfoSecu infoSecu);

    /**
     * Méthode permettant de récupérer la liste des informations de tout les utilisateurs
     * @return La liste des informations de tout les utilisateurs
     */
    List<InfoSecu> fetchInfoSecuList();

    /**
     * Méthode permettant de récupérer les informations d'un utilisateur via l'id
     * @param id L'id des informations d'un utilisateur
     * @return Les informations d'un utilisateur
     */
    Optional<InfoSecu> FetchInfoSecuById(Long id);

    /**
     * Méthode permettant de mettre à jour les informations d'un utilisateur dans la base de donnée
     * @param infoSecu Les informations qui mettreont à jour
     * @param infoSecuId Les informations qui sera mis à jour
     * @return Les informations mis à jour
     */
    InfoSecu UpdateInfoSecu(InfoSecu infoSecu, Long infoSecuId);

    /**
     * Méthode permettant de supprimer les informations d'un utilisateur dans la base de donnée
     * @param infoSecuId L'id des informations à supprimer
     */
    void deleteInfoSecu(Long infoSecuId);
}
