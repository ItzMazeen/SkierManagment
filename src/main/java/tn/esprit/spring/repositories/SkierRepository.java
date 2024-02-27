package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Skier;
@Repository
public interface SkierRepository extends JpaRepository<Skier,Long> {

}
