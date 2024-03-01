package tn.esprit.spring.services;

import tn.esprit.spring.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    Subscription addSubscription(Subscription subscription);
    Subscription upadateSubscription(Subscription subscription);
    void removeSkier(Long IdSubscription);
    Subscription retrieveSubscription(Long IdSubscription);
    List<Subscription> retrieveAllSubscription();
}
