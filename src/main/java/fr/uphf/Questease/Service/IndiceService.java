package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Model.InfoSecu;
import fr.uphf.Questease.Repository.IndiceRepository;

import java.util.List;

public interface IndiceService {
    Indice SaveIndice(Indice indice);

    List<Indice> FetchIndiceList();

    Indice UpdateIndice(Indice indice, Long indiceId);

    void deleteIndice(Long indiceId);
}
