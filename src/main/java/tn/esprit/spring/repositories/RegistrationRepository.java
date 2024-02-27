package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Registration;
@Repository

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
}
