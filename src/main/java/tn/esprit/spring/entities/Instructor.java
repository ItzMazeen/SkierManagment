package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Instructor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdInstructor")
    private Long IdInstructor;

    private Long numInstructor;
    private String firstName;
    private String lastName;
    private Date dateOfHire;

    @OneToMany
    private Set<Course> courses;

}
