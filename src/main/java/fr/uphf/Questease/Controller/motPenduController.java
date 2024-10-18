package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.MotPendu;
import fr.uphf.Questease.Repository.MotPenduRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class motPenduController {

    private final MotPenduRepository repo;

    public motPenduController(MotPenduRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/{idMotPendu}")
    public Optional<MotPendu> getMotById(@PathVariable Long idMot) {
        return repo.findById(idMot);
    }

    @PostMapping("/{idMotPendu}")
    public void PostMot(@PathVariable MotPendu M) {
        repo.save(M);
    }

    @PatchMapping("/{idMotPendu}")
    public void UpdateMot(Long IdMotPendu, @PathVariable MotPendu M) {
        repo.deleteById(IdMotPendu);
        repo.save(M);
    }

    @DeleteMapping("/{idMotPendu}")
    public void DeleteMot(@PathVariable MotPendu M) {
        repo.delete(M);
    }
}