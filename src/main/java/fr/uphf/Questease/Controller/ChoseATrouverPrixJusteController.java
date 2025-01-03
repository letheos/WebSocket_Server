package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.ChoseATrouverPrixJuste;
import fr.uphf.Questease.Repository.ChoseATrouverPrixJusteRepository;
import fr.uphf.Questease.Service.ChoseATrouverPrixJusteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller du repositoire de ChoseATrouverPrixJuste
 */
@RestController
@RequestMapping("/choseATrouver")
public class ChoseATrouverPrixJusteController {

    private final ChoseATrouverPrixJusteServiceImpl repo;

    public ChoseATrouverPrixJusteController(ChoseATrouverPrixJusteServiceImpl repo) {
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ChoseATrouverPrixJuste>> GetChoseById(@PathVariable Long id) {
        return ResponseEntity.ok(repo.ReadChose(id));
    }

    @PostMapping("/{idChoseATrouver}")
    public void PostChose(@PathVariable Long idChoseATrouver, @RequestBody ChoseATrouverPrixJuste C) {
        repo.SaveChose(C);
    }

    @PatchMapping("/{idChoseATrouver}")
    public void UpdateChoseATrouver(@PathVariable Long idChoseATrouver, @RequestBody ChoseATrouverPrixJuste C) {
        repo.UpdateChose(C, idChoseATrouver);
    }

    @DeleteMapping("/{idChoseATrouver}")
    public void DeleteChose(@PathVariable Long idChoseATrouver) {
        repo.DeleteChose(idChoseATrouver);
    }

    @GetMapping("")
    public List<ChoseATrouverPrixJuste> getALL(){
        return repo.FetchChoseList();
    }
}

