package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;

import java.util.List;

public interface JoueurTmpService {
    JoueurTmp SaveUtilisateur(JoueurTmp joueurTmp);

    List<JoueurTmp> FetchUtilisateurList();

    Iterable<JoueurTmp> FetchOne(String pseudoUser);

    JoueurTmp UpdateUtilisateur(JoueurTmp joueurTmp, Long utilisateurId);

    void DeleteUtilisateur(Long utilisateurId);

}
