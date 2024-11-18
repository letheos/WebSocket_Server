package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Model.MotCryptex;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositoire de la classe MotCryptex
 */
@Repository
public interface MotCryptexRepository extends CrudRepository<MotCryptex, Long> {
    @Query("""
    select ind from MotCryptex mc join mc.indice ind 
    """)
    List<Indice> GetIndiceWithId();

}
