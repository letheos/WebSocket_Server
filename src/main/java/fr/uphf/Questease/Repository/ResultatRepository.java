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

}


