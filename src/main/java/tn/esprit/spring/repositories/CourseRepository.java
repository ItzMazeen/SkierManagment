package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Course;
@Repository

public interface CourseRepository extends JpaRepository<Course,Long> {
}
