package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.MotCryptex;
import fr.uphf.Questease.Model.MotPendu;
import fr.uphf.Questease.Repository.MotCryptexRepository;
import fr.uphf.Questease.Repository.MotPenduRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MotPenduServiceImpl implements MotPenduService {
    @Autowired
    private MotPenduRepository repo;


    @Override
    public MotPendu SaveMotPendu(MotPendu motPendu) {
        return repo.save(motPendu);
    }

    @Override
    public List<MotPendu> FetchMotPenduList() {
        return (List<MotPendu>) repo.findAll();
    }

    @Override
    public MotPendu UpdateMotPendu(MotPendu motPendu, Long motPenduId) {
        repo.deleteById(motPenduId);
        return repo.save(motPendu);
    }

    @Override
    public void DeleteMotPendu(Long motPenduId) {
        repo.deleteById(motPenduId);
    }
}
