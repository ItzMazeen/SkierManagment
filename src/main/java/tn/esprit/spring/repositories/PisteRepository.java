package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Piste;
@Repository

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
