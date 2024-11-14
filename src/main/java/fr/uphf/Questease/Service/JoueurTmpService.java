package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;

import java.util.List;
import java.util.Optional;

public interface JoueurTmpService {
    JoueurTmp SaveJoueur(JoueurTmp joueurTmp);

    List<JoueurTmp> FetchJoueurList();

    Optional<JoueurTmp> FetchOne(Long id);

    JoueurTmp UpdateJoueur(JoueurTmp joueurTmp, Long utilisateurId);

    void DeleteJoueur(Long utilisateurId);

}
