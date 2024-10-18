package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.InfoSecu;
import fr.uphf.Questease.Model.Utilisateur;
import fr.uphf.Questease.Repository.InfoSecuRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class InfoSecuController {

    private final InfoSecuRepository repo;

    public InfoSecuController(InfoSecuRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/idinfoSecu")
    public Optional<InfoSecu> getInfoSecuById(@PathVariable Long idInfo){
        return repo.findById(idInfo);
    }

    @PostMapping("/{idinfoSecu}")
    public void PostInfoSecu(@PathVariable InfoSecu IS){
        repo.save(IS);
    }

    @PatchMapping("/{idinfoSecu}")
    public void UpdateInfoSecu(Long IdinfoSecu, @PathVariable InfoSecu IS){
        repo.deleteById(IdinfoSecu);
        repo.save(IS);
    }

    @DeleteMapping("/{idinfoSecu}")
    public void DeleteinfoSecu(@PathVariable InfoSecu IS){
        repo.delete(IS);
    }
}
