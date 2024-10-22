package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.InfoSecu;
import fr.uphf.Questease.Repository.InfoSecuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InfoSecuServicelmpl implements InfoSecuService{

    @Autowired
    private InfoSecuRepository infoSecuRepository;

    @Override
    public InfoSecu saveInfoSecu(InfoSecu infoSecu) {
        return infoSecuRepository.save(infoSecu);
    }

    @Override
    public List<InfoSecu> fetchInfoSecuList() {
        return (List<InfoSecu>) infoSecuRepository.findAll();
    }

    @Override
    public Optional<InfoSecu> FetchInfoSecuById(Long id) {
        return infoSecuRepository.findById(id);
    }


    @Override
    public InfoSecu UpdateInfoSecu(InfoSecu infoSecu, Long infoSecuId) {
         infoSecuRepository.deleteById(infoSecuId);
         return infoSecuRepository.save(infoSecu);
    }

    @Override
    public void deleteInfoSecu(Long infoSecuId) {
        infoSecuRepository.deleteById(infoSecuId);
    }
}
