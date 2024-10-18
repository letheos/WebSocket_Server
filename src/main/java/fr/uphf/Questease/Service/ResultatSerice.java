package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Resultat;

import java.util.List;

public interface ResultatSerice {
    Resultat SaveResultat(Resultat resultat);

    List<Resultat> FetchResultatList();

    Resultat UpdateResultat(Resultat resultat, Long resultatId);

    void DeleteResultat(Long resultatId);
}
