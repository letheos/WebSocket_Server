package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Resultat;

import java.util.List;
import java.util.Optional;

public interface ResultatService {
    Resultat SaveResultat(Resultat resultat);

    List<Resultat> FetchResultatList();

    Optional<Resultat> FetchOne(Long idResultat);

    Resultat UpdateResultat(Resultat resultat, Long resultatId);

    void DeleteResultat(Long resultatId);
}
