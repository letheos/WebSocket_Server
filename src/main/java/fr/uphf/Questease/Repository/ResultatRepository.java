package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Resultat;
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
     * Requête permettant de récupérer les résultats d'un utilisateur
     * @param Username Le pseudonyme de l'utilisateur
     * @return Les résultats d'un utilisateur
     */
    @Query("SELECT COUNT(IsEpreuve1), COUNT(IsEpreuve2), COUNT(IsEpreuve3), COUNT(IsEpreuve4) " +
            "WHERE pseudoUser = :Username GROUP BY IdUser")
    public List<Resultat> findResultByUsername(@Param("pseudoUser") String Username);

    /**
     * Requête permettant d'ajouter les résultats d'un utilisateur
     * @param IT Le booléan représentant si l'utilisateur a battu le jeu où non
     * @param IE1 Le booléan représentant si l'utilisateur a battu le mini-jeu TODO
     * @param IE2 Le booléan représentant si l'utilisateur a battu le jeu TODO
     * @param IE3 Le booléan représentant si l'utilisateur a battu le jeu TODO
     * @param IE4 Le booléan représentant si l'utilisateur a battu le jeu TODO
     * @param IP
     */
    @Query("INSERT INTO Result(IsTresor, IsEpreuve1, IsEpreuve2, IsEpreuve3, IsEpreuve4, idPartie)" +
            "VALUES(:IT, :IE1, :IE2, :IE3, :IE4, :IP")
    public void addResultByUser(boolean IT, boolean IE1, boolean IE2, boolean IE3, boolean IE4, boolean IP);
}
