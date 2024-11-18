package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;

import java.util.List;
import java.util.Optional;

/**
 * Interface du service de JoueurTmp
 */
public interface JoueurTmpService {

    /**
     * Méthode permettant de sauvegarder un JoueurTmp en base de donnée
     * @param joueurTmp Le joueur à sauvegarder en base  de donnée
     * @return Le joueur à sauvegarder en base  de donnée
     */
    JoueurTmp SaveJoueur(JoueurTmp joueurTmp);

    /**
     * Méthode permettant de récupérer la liste de tout les joueurs en base de donnée
     * @return La liste des joueurs
     */
    List<JoueurTmp> FetchJoueurList();

    /**
     * Méthode permettant de récupérer un joueur via son id
     * @param id L'id du joueur à récupérer
     * @return Le joueur à récupérer
     */
    Optional<JoueurTmp> FetchOne(Long id);

    /**
     * Méthode permettant de mettre à jour un joueur en base de donnée
     * @param joueurTmp Le joueur à mettre à jour
     * @param utilisateurId L'id du joueur qui sera mis à jour
     * @return Le joueur mis à jour
     */
    JoueurTmp UpdateJoueur(JoueurTmp joueurTmp, Long utilisateurId);

    /**
     * Méthode permettant de supprimer un joueur de la base de donnée
     * @param idJoueur L'id du joueur à supprimer
     */
    void DeleteJoueur(Long idJoueur);

}
