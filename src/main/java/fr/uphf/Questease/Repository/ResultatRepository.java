package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Resultat;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositoire de la classe Resultat
 */
@Repository
public interface ResultatRepository extends CrudRepository<Resultat, Long> {


    /**
     * Requête permettant d'ajouter les résultats d'un utilisateur
     * @param IT Le booléan représentant si l'utilisateur a battu le jeu où non
     * @param IE1 Le booléan représentant si l'utilisateur a battu le mini-jeu TODO
     * @param IE2 Le booléan représentant si l'utilisateur a battu le jeu TODO
     * @param IE3 Le booléan représentant si l'utilisateur a battu le jeu TODO
     * @param IE4 Le booléan représentant si l'utilisateur a battu le jeu TODO
     * @param IP
     */
    @Query("SELECT COUNT(r.isPendu) as nbrPendu, COUNT(r.isCryptex) as nbrCryptex, COUNT(r.isprixjuste) nbrPrixJuste, COUNT(r.isSon) as nbrSon " +
            "FROM Resultat r WHERE r.utilisateur.nom = :pseudoUser GROUP BY r.utilisateur.id")
    List<Object[]> findResultByUsername(@Param("pseudoUser") String pseudoUser);

}
