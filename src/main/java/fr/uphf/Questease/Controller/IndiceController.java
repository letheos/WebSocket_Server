package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Repository.IndiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class IndiceController {

    private final IndiceRepository repo;


    public IndiceController(IndiceRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/idIndice")
    public Optional<Indice> getIndiceById(@PathVariable Long idIndice) {
        return repo.findById(idIndice);
    }

    @PostMapping("/{idIndice}")
    public void PostIndice(@PathVariable Indice I) {
        repo.save(I);
    }

    @PatchMapping("/{idIndice}")
    public void UpdateIndice(Long IdIndice, @PathVariable Indice I) {
        repo.deleteById(IdIndice);
        repo.save(I);
    }

    @DeleteMapping("/{idIndice}")
    public void DeleteinfoSecu(@PathVariable Indice I) {
        repo.delete(I);
    }
}
