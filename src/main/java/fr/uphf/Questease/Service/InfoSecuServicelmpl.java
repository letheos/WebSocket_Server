package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.InfoSecu;
import fr.uphf.Questease.Repository.InfoSecuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implémentation de l'interface d'infoSecu
 */
@Service
public class InfoSecuServicelmpl implements InfoSecuService{

    /**
     * Le repositoire d'infoSecu
     */
    @Autowired
    private InfoSecuRepository infoSecuRepository;

    /**
     * Méthode permettant de sauvegarder les informations de compte d'un utilisateur en base de donnée
     */
    @Override
    public InfoSecu saveInfoSecu(InfoSecu infoSecu) {
        return infoSecuRepository.save(infoSecu);
    }

    /**
     * Méthode permettant de récupérer la liste des informations de tout les utilisateurs
     * @return La liste des informations de tout les utilisateurs
     */
    @Override
    public List<InfoSecu> fetchInfoSecuList() {
        return (List<InfoSecu>) infoSecuRepository.findAll();
    }

    /**
     * Méthode permettant de récupérer les informations d'un utilisateur via l'id
     * @param id L'id des informations d'un utilisateur
     * @return Les informations d'un utilisateur
     */
    @Override
    public Optional<InfoSecu> FetchInfoSecuById(Long id) {
        return infoSecuRepository.findById(id);
    }

    /**
     * Méthode permettant de mettre à jour les informations d'un utilisateur dans la base de donnée
     * @param infoSecu Les informations qui mettreont à jour
     * @param infoSecuId Les informations qui sera mis à jour
     * @return Les informations mis à jour
     */
    @Override
    public InfoSecu UpdateInfoSecu(InfoSecu infoSecu, Long infoSecuId) {
         infoSecuRepository.deleteById(infoSecuId);
         return infoSecuRepository.save(infoSecu);
    }

    /**
     * Méthode permettant de supprimer les informations d'un utilisateur dans la base de donnée
     * @param infoSecuId L'id des informations à supprimer
     */
    @Override
    public void deleteInfoSecu(Long infoSecuId) {
        infoSecuRepository.deleteById(infoSecuId);
    }
}
