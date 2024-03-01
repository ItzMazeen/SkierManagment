package tn.esprit.spring.services;

import tn.esprit.spring.entities.Instructor;


import java.util.List;

public interface IInstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor upadateInstructor(Instructor instructor);
    void removeInstructor(Long IdInstructor);
    Instructor retrieveInstructor(Long IdInstructor);
    List<Instructor> retrieveAllInstructor();
}
