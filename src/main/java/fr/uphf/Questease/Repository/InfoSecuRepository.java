package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.InfoSecu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositoire de la classe InfoSecu
 */
@Repository
public interface InfoSecuRepository extends CrudRepository<InfoSecu, Long> {

}
