package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.MotCryptex;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotCryptexRepository extends CrudRepository<MotCryptex, Long> {

}
