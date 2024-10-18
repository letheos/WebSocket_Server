package fr.uphf.Questease.Controller;


import fr.uphf.Questease.Model.Son;
import fr.uphf.Questease.Repository.SonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class SonController {

    private final SonRepository repo;

    public SonController(SonRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/idSon")
    public Optional<Son> getSonById(@PathVariable Long idSon) {
        return repo.findById(idSon);
    }

    @PostMapping("/{idSon}")
    public void PostSon(@PathVariable Son S) {
        repo.save(S);
    }

    @PatchMapping("/{idSon}")
    public void UpdateSon(Long IdSon, @PathVariable Son S) {
        repo.deleteById(IdSon);
        repo.save(S);
    }

    @DeleteMapping("/{idSon}")
    public void DeleteSon(@PathVariable Son S) {
        repo.delete(S);
    }
}
