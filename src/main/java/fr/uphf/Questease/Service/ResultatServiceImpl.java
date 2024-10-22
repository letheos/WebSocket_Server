package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Resultat;
import fr.uphf.Questease.Repository.ResultatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultatServiceImpl implements ResultatService{
    private ResultatRepository repo;

    @Override
    public Resultat SaveResultat(Resultat resultat) {
        return repo.save(resultat);
    }

    @Override
    public List<Resultat> FetchResultatList() {
        return (List<Resultat>) repo.findAll();
    }

    public Optional<Resultat> FetchOne(Long idResultat){
        return repo.findById(idResultat);
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
