package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;
import fr.uphf.Questease.Repository.JoueurTpmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoueurTmpServiceImpl implements JoueurTmpService {
    @Autowired
    private JoueurTpmRepository repo;

    @Override
    public JoueurTmp SaveUtilisateur(JoueurTmp joueurTmp) {
        return repo.save(joueurTmp);
    }

    @Override
    public List<JoueurTmp> FetchUtilisateurList() {
        return (List<JoueurTmp>) repo.findAll();
    }

    @Override
    public Iterable<JoueurTmp> FetchOne(String pseudoUser){
        return repo.findUtilByName(pseudoUser);
    }

    @Override
    public JoueurTmp UpdateUtilisateur(JoueurTmp joueurTmp, Long utilisateurId) {
        repo.deleteById(utilisateurId);
        return repo.save(joueurTmp);
    }

    @Override
    public void DeleteUtilisateur(Long utilisateurId) {
        repo.deleteById(utilisateurId);
    }
}
