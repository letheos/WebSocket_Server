package fr.uphf.Questease.Repositery;

import fr.uphf.Questease.Model.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public abstract class UtilRepository implements CrudRepository<Utilisateur, Long> {


    @Query("SELECT * FROM UTILISATEUR WHERE pseudoUser = :nomUtil")
    abstract Iterable<Utilisateur> findUtilByName(@Param("pseudoUser") String nomUtil);


}
