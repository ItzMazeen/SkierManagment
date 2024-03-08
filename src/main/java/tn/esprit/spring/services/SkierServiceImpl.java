package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Skier;
import tn.esprit.spring.repositories.SkierRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class SkierServiceImpl implements ISkierService{
    SkierRepository skierRepository;

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier upadateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public void removeSkier(Long IdSkier) {
        skierRepository.deleteById(IdSkier);
    }

    @Override
    public Skier retrieveSkier(Long IdSkier) {
        return skierRepository.findById(IdSkier).get();
    }

    @Override
    public List<Skier> retrieveAllSkiers() {
        return skierRepository.findAll();
    }

    @Override
    public List<Skier> addListSkier(List<Skier> skieurs) {
        return skierRepository.saveAll(skieurs);
    }

    @Override
    public List<Skier> listSkieurBydate(LocalDate datedeb, LocalDate datefin) {
        return skierRepository.findByDateOfBirthBetween(datedeb, datefin);
    }

}
