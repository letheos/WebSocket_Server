package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.InfoSecu;

import java.util.List;
import java.util.Optional;

public interface InfoSecuService {
    InfoSecu saveInfoSecu(InfoSecu infoSecu);

    List<InfoSecu> fetchInfoSecuList();

    Optional<InfoSecu> FetchInfoSecuById(Long id);

    InfoSecu UpdateInfoSecu(InfoSecu infoSecu, Long infoSecuId);

    void deleteInfoSecu(Long infoSecuId);
}
