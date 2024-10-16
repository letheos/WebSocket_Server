package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Resultat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InfoSecuRepository extends CrudRepository<Resultat, Long> {

    @Query("")
    public Optional<Resultat> findById(Long aLong);
}
