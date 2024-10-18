package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Repository.IndiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndiceServiceImpl implements IndiceService {
    @Autowired
    private IndiceRepository repo;

    @Override
    public Indice SaveIndice(Indice indice) {
        return repo.save(indice);
    }

    @Override
    public List<Indice> FetchIndiceList() {
        return (List<Indice>)repo.findAll();
    }

    @Override
    public Indice UpdateIndice(Indice indice, Long indiceId) {
        repo.deleteById(indiceId);
        return repo.save(indice);
    }

    @Override
    public void deleteIndice(Long indiceId) {
        repo.deleteById(indiceId);
    }
}
