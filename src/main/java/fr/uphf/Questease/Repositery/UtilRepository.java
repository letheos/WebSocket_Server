package fr.uphf.Questease.Repositery;

import fr.uphf.Questease.Model.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UtilRepository extends CrudRepository<Utilisateur, Long> {


    @Query("SELECT * FROM UTILISATEUR WHERE idUtil = :id")
    Iterable<Utilisateur> findUtilByName(@Param("pseudoUser") int id);


}
