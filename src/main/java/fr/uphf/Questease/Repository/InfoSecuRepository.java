package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.InfoSecu;
import fr.uphf.Questease.Model.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoSecuRepository extends CrudRepository<InfoSecu, Long> {

}
