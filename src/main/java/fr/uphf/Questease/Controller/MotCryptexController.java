package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.MotCryptex;
import fr.uphf.Questease.Repository.MotCryptexRepository;
import fr.uphf.Questease.Service.MotCryptexServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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