package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repositoire de la classe Utilisateur
 */
@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

    /**
     * Requête permettant de récupérer les utilisateurs par leurs noms
     * @param name Le pseudonyme de l'utilisateur qui doit être récupéré
     * @return L'utilisateur associé au nom
     */
    @Query("SELECT * FROM UTILISATEUR WHERE pseudoUser = :name")
    Iterable<Utilisateur> findUtilByName(@Param("pseudoUser") String name);


}
