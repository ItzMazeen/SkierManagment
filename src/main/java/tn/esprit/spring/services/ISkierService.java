package tn.esprit.spring.services;

import tn.esprit.spring.entities.Skier;

import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier skier);
    Skier upadateSkier(Skier skier);
    void removeSkier(Long Idskier);
    Skier retrieveSkier(Long Idskier);
    List<Skier> retrieveAllSkiers();




}
