package fr.uphf.Questease.Repository;

import fr.uphf.Questease.Model.Resultat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResultatRepositery extends CrudRepository<Resultat, Long> {

    @Query("SELECT COUNT(IsEpreuve1), COUNT(IsEpreuve2), COUNT(IsEpreuve3), COUNT(IsEpreuve4) " +
            "WHERE pseudoUser = :Username GROUPBY IdUser")
    public List<Resultat> findResultByUsername(@Param("pseudoUser") String Username);

    @Query("INSERT INTO Result(IsTresor, IsEpreuve1, IsEpreuve2, IsEpreuve3, IsEpreuve4, idPartie)" +
            "VALUES(:IT, :IE1, :IE2, :IE3, :IE4, :IP")
    public void addResultByUser(boolean IT, boolean IE1, boolean IE2, boolean IE3, boolean IE4, boolean IP);
}
