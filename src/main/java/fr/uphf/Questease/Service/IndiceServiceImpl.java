package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Repository.IndiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implémentation de l'interface d'Indice
 */
@Service
public class IndiceServiceImpl implements IndiceService {

    /**
     * Repositoire de la classe Indice
     */
    @Autowired
    private IndiceRepository repo;

    /**
     * Méthode permettant de sauvegarder un indice en base de donnée
     * @param indice L'indice à sauvegarder
     * @return L'indice à sauvegarder
     */
    @Override
    public Indice SaveIndice(Indice indice) {
        return repo.save(indice);
    }

    /**
     * Méthode permettant de récupérer la liste de tout les indices
     * @return La liste d'indice
     */
    @Override
    public List<Indice> FetchIndiceList() {
        return (List<Indice>)repo.findAll();
    }

    /**
     * Méthode permettant de récupérer un indice via son id
     * @param id L'id de l'indice à récupérer
     * @return L'indice à récupérer
     */
    @Override
    public Optional<Indice> FetchIndice(Long id) {
        return repo.findById(id);
    }

    /**
     * Méthode permettant de mettre à jour un indice dans la base de donnée
     * @param indice L'indice qui sera mis à jour
     * @param indiceId L'id de l'indice à mettre à jour
     * @return L'indice mis à jour
     */
    @Override
    public Indice UpdateIndice(Indice indice, Long indiceId) {
        repo.deleteById(indiceId);
        return repo.save(indice);
    }

    /**
     * Méthode permettant de supprimer un indice dans la base de donnée
     * @param indiceId L'id de l'indice à mettre à jour
     */
    @Override
    public void deleteIndice(Long indiceId) {
        repo.deleteById(indiceId);
    }
}
