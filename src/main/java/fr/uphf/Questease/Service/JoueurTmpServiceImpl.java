package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;
import fr.uphf.Questease.Repository.JoueurTpmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JoueurTmpServiceImpl implements JoueurTmpService {
    @Autowired
    private JoueurTpmRepository repo;

    @Override
    public JoueurTmp SaveJoueur(JoueurTmp joueurTmp) {
        return repo.save(joueurTmp);
    }

    @Override
    public List<JoueurTmp> FetchJoueurList() {
        return (List<JoueurTmp>) repo.findAll();
    }

    @Override
    public Optional<JoueurTmp> FetchOne(Long id){
        return repo.findById(id);
    }

    @Override
    public JoueurTmp UpdateJoueur(JoueurTmp joueurTmp, Long idJoueur) {
        repo.deleteById(idJoueur);
        return repo.save(joueurTmp);
    }

    @Override
    public void DeleteJoueur(Long idJoueur) {
        repo.deleteById(idJoueur);
    }

    public boolean Exist(Long idJoueur){
        return repo.existsById(idJoueur);
    }


}
