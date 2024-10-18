package fr.uphf.Questease.Service;

import fr.uphf.Questease.Model.MotPendu;

import java.util.List;

public interface MotPenduService {
    MotPendu SaveMotPendu(MotPendu motPendu);

    List<MotPendu> FetchMotPenduList();

    MotPendu UpdateMotPendu(MotPendu motPendu, Long motpenduId);

    void DeleteMotPendu(Long motPenduId);
}
