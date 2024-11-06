package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Lobby;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LobbyRepository extends CrudRepository<Lobby, Long> {
}
