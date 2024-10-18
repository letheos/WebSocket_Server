package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Model.MotCryptex;

import java.util.List;

public interface MotCryptexService {
    MotCryptex SaveMotCryptex(MotCryptex motCryptex);

    List<MotCryptex> FetchMotCryptexList();

    MotCryptex UpdateMotCryptex(MotCryptex motCryptex, Long motCrpyexId);

    void deleteMotCryptex(Long motCryptexId);
}
