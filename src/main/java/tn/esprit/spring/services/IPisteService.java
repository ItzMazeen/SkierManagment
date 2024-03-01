package tn.esprit.spring.services;

import tn.esprit.spring.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste upadatePiste(Piste piste);
    void removeSkier(Long IdPiste);
    Piste retrievePiste(Long IdPiste);
    List<Piste> retrieveAllPiste();
}
