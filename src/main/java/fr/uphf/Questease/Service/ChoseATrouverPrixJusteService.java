package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.ChoseATrouverPrixJuste;
import fr.uphf.Questease.Model.InfoSecu;

import java.util.List;

public interface ChoseATrouverPrixJusteService {
    ChoseATrouverPrixJuste SaveChose(ChoseATrouverPrixJuste chose);

    List<ChoseATrouverPrixJuste> FetchChoseList();

    ChoseATrouverPrixJuste UpdateChose(ChoseATrouverPrixJuste chose, Long choseId);

    void DeleteChose(Long choseId);
}
