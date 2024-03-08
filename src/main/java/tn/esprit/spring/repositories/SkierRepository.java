package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Skier;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SkierRepository extends JpaRepository<Skier,Long> {
    List<Skier> findByDateOfBirthBetween(LocalDate datedeb , LocalDate datefin);
}
