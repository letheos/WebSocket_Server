package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.InfoSecu;

import java.util.List;

public interface InfoSecuService {
    InfoSecu saveInfoSecu(InfoSecu infoSecu);

    List<InfoSecu> fetchInfoSecuList();

    InfoSecu UpdateInfoSecu(InfoSecu infoSecu, Long infoSecuId);

    void deleteInfoSecu(Long infoSecuId);
}
