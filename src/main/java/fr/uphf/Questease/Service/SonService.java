package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.Son;

import java.util.List;

public interface SonService {
    Son SaveSon(Son son);

    List<Son> FetchSonList();

    Son UpdateSon(Son son, Long sonId);

    void DeleteSon(Long sonId);
}
