package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Skier;
import tn.esprit.spring.repositories.SkierRepository;

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
    public void removeSkier(Long Idskier) {
        skierRepository.deleteById(Idskier);
    }

    @Override
    public Skier retrieveSkier(Long Idskier) {
        return skierRepository.findById(Idskier).get();
    }

    @Override
    public List<Skier> retrieveAllSkiers() {
        return skierRepository.findAll();
    }
}
