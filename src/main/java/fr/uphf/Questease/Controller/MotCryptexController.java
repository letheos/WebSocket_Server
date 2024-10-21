package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.MotCryptex;
import fr.uphf.Questease.Repository.MotCryptexRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class MotCryptexController {

    private final MotCryptexRepository repo;

    public MotCryptexController(MotCryptexRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/idMotCryptex")
    public Optional<MotCryptex> getMotById(@PathVariable Long idMotCryptex) {
        return repo.findById(idMotCryptex);
    }

    @PostMapping("/{idMotCryptex}")
    public void PostIndice(@PathVariable MotCryptex M) {
        repo.save(M);
    }

    @PatchMapping("/{idMotCryptex}")
    public void UpdateMot(Long IdMot, @PathVariable MotCryptex M) {
        repo.deleteById(IdMot);
        repo.save(M);
    }

    @DeleteMapping("/{idMoCryptex}")
    public void DeleteMot(@PathVariable MotCryptex M) {
        repo.delete(M);
    }
}