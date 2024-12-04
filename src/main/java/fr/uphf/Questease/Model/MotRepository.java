package fr.uphf.Questease.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import java.util.Random;

public interface MotRepository extends JpaRepository<Mot, Long> {

    // Requête native pour récupérer un mot aléatoire
    @Query(value = "SELECT * FROM mot ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Optional<Mot> findRandomMot();

}
