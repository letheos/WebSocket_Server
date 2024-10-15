package fr.uphf.Questease.Repositery;

import fr.uphf.Questease.Model.Resultat;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Resultat_Repo extends CrudRepository<Resultat, Long> {

    @Override
    public Optional<Resultat> findById(Long aLong);
}
