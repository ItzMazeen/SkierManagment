package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Subscription;
@Repository

public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {
}
