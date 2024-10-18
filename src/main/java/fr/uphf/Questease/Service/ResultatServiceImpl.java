package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Resultat;
import fr.uphf.Questease.Repository.ResultatRepositery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultatServiceImpl implements ResultatSerice{
    private ResultatRepositery repo;

    @Override
    public Resultat SaveResultat(Resultat resultat) {
        return repo.save(resultat);
    }

    @Override
    public List<Resultat> FetchResultatList() {
        return (List<Resultat>) repo.findAll();
    }

    @Override
    public Resultat UpdateResultat(Resultat resultat, Long resultatId) {
        repo.deleteById(resultatId);
        return repo.save(resultat);
    }

    @Override
    public void DeleteResultat(Long resultatId) {
        repo.deleteById(resultatId);
    }
}
