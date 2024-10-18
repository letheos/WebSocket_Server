package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.ChoseATrouverPrixJuste;
import fr.uphf.Questease.Repository.ChoseATrouverPrixJusteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("")
public class ChoseATrouverPrixJusteController {

    private final ChoseATrouverPrixJusteRepository repo;

    public ChoseATrouverPrixJusteController(ChoseATrouverPrixJusteRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/{idChoseATrouver}")
    public ResponseEntity<Optional<ChoseATrouverPrixJuste>> GetChoseById(@PathVariable Long idChose) {
        return ResponseEntity.ok(repo.findById(idChose));
    }

    @PostMapping("/{idchoseATrouver}")
    public void PostChose(@PathVariable ChoseATrouverPrixJuste C) {
        repo.save(C);
    }

    @PatchMapping("/{idchoseATrouver}")
    public void UpdateChoseATrouver(Long idChose, @PathVariable ChoseATrouverPrixJuste C) {
        repo.deleteById(idChose);
        repo.save(C);
    }

    @DeleteMapping("/{idChoseATrouver}")
    public void DeleteChose(@PathVariable ChoseATrouverPrixJuste C) {
        repo.delete(C);
    }
}
