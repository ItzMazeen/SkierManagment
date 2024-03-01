package tn.esprit.spring.services;

import tn.esprit.spring.entities.Course;
import tn.esprit.spring.entities.Skier;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course Course);
    Course upadateCourse(Course Course);
    void removeCourse(Long IdCourse);
    Course retrieveCourse(Long IdCourse);
    List<Course> retrieveAllCourses();

}
