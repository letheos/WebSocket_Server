package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

    @Query("SELECT * FROM UTILISATEUR WHERE pseudoUser = :name")
    Iterable<Utilisateur> findUtilByName(@Param("pseudoUser") String name);


}
