package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Son;
import fr.uphf.Questease.Repository.SonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SonServiceImpl implements SonService {
    private SonRepository repo;

    @Override
    public Son SaveSon(Son son) {
        return repo.save(son);
    }

    @Override
    public List<Son> FetchSonList() {
        return (List<Son>) repo.findAll();
    }

    @Override
    public Son UpdateSon(Son son, Long sonId) {
        repo.deleteById(sonId);
        return repo.save(son);
    }

    @Override
    public void DeleteSon(Long sonId) {
        repo.deleteById(sonId);
    }
}
