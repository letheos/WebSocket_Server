package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UtililisateurRepository extends CrudRepository<Utilisateur, Long> {

    @Query("SELECT * FROM UTILISATEUR WHERE idUtil = :id")
    Iterable<Utilisateur> findUtilByName(@Param("pseudoUser") int id);

    
}
