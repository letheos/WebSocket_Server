package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.JoueurTmp;
import fr.uphf.Questease.Repository.JoueurTpmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implémentation de l'interface de JoueurTmp
 */
@Service
public class JoueurTmpServiceImpl implements JoueurTmpService {

    /**
     * Repositoire de la classe JoueurTmp
     */
    @Autowired
    private JoueurTpmRepository repo;

    /**
     * Méthode permettant de sauvegarder un JoueurTmp en base de donnée
     * @param joueurTmp Le joueur à sauvegarder en base  de donnée
     * @return Le joueur à sauvegarder en base  de donnée
     */
    @Override
    public JoueurTmp SaveJoueur(JoueurTmp joueurTmp) {
        return repo.save(joueurTmp);
    }

    /**
     * Méthode permettant de récupérer la liste de tout les joueurs en base de donnée
     * @return La liste des joueurs
     */
    @Override
    public List<JoueurTmp> FetchJoueurList() {
        return (List<JoueurTmp>) repo.findAll();
    }

    /**
     * Méthode permettant de récupérer un joueur via son id
     * @param id L'id du joueur à récupérer
     * @return Le joueur à récupérer
     */
    @Override
    public Optional<JoueurTmp> FetchOne(Long id){
        return repo.findById(id);
    }

    /**
     * Méthode permettant de mettre à jour un joueur en base de donnée
     * @param joueurTmp Le joueur à mettre à jour
     * @param idJoueur L'id du joueur qui sera mis à jour
     * @return Le joueur mis à jour
     */
    @Override
    public JoueurTmp UpdateJoueur(JoueurTmp joueurTmp, Long idJoueur) {
        repo.deleteById(idJoueur);
        return repo.save(joueurTmp);
    }

    /**
     * Méthode permettant de supprimer un joueur de la base de donnée
     * @param idJoueur L'id du joueur à supprimer
     */
    @Override
    public void DeleteJoueur(Long idJoueur) {
        repo.deleteById(idJoueur);
    }

    public boolean Exist(Long idJoueur){
        return repo.existsById(idJoueur);
    }


}
