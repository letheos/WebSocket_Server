package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.MotCryptex;
import fr.uphf.Questease.Repository.MotCryptexRepository;
import fr.uphf.Questease.Service.MotCryptexServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.random.RandomGenerator;

@RestController
@RequestMapping
public class MotCryptexController {

    private final MotCryptexServiceImpl repo;

    public MotCryptexController(MotCryptexServiceImpl repo) {
        this.repo = repo;
    }


    @GetMapping("/idMotCryptex")
    public Optional<MotCryptex> getMotById(@PathVariable Long idMotCryptex) {
        return repo.FetchMotCryptex(idMotCryptex);
    }

    @GetMapping("MotCryptex")
    public MotCryptex getRandomWord(){
        List<MotCryptex> liste = repo.FetchMotCryptexList();
        return liste.get(0 + (int)(Math.random() * ((liste.size() - 0) + 1)));
    }

    @PostMapping("/{idMotCryptex}")
    public void PostIndice(@PathVariable MotCryptex M) {
        repo.SaveMotCryptex(M);
    }

    @PatchMapping("/{idMotCryptex}")
    public void UpdateMot(Long IdMot, @PathVariable MotCryptex M) {
        repo.deleteMotCryptex(IdMot);
        repo.SaveMotCryptex(M);
    }

    @DeleteMapping("/{idMoCryptex}")
    public void DeleteMot(@PathVariable MotCryptex M) {
        repo.deleteMotCryptex(M.getId());
    }
}