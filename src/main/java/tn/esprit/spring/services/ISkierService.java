package tn.esprit.spring.services;

import tn.esprit.spring.entities.Skier;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ISkierService {
    public Skier addSkier(Skier skier);
    public Skier upadateSkier(Skier skier);
    void removeSkier(Long IdSkier);
    public Skier retrieveSkier(Long IdSkier);
    public List<Skier> retrieveAllSkiers();
    public List<Skier> addListSkier(List<Skier> skieurs);


    List<Skier> listSkieurBydate(LocalDate datedeb, LocalDate datefin);
}
