package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.JoueurTmp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repositoire de la classe Utilisateur
 */
@Repository
public interface JoueurTpmRepository extends CrudRepository<JoueurTmp, Long> {

    /**
     * Requête permettant de récupérer les utilisateurs par leurs noms
     * @param pseudoUser Le pseudonyme de l'utilisateur qui doit être récupéré
     * @return L'utilisateur associé au nom
     */
    @Query("""
            SELECT u FROM JoueurTmp u WHERE u.pseudo = :pseudoUser""")
    Iterable<JoueurTmp> findUtilByName(@Param("pseudoUser") String pseudoUser);

}
