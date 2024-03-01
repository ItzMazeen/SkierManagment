package tn.esprit.spring.services;


import tn.esprit.spring.entities.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistration(Registration registration);
    Registration upadateRegistration(Registration registration);
    void removeRegistration(Long IdRegistration);
    Registration retrieveRegistration(Long IdRegistration);
    List<Registration> retrieveAllRegistration();
}
