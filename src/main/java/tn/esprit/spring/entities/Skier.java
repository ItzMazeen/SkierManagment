package tn.esprit.spring.entities;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Skier")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdSkier")
    private Long IdSkier;

    private Long numPiste;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String city;

    @ManyToMany
    private Set<Piste> pistes;

    @OneToMany(mappedBy = "skier",cascade = CascadeType.ALL)
    private Set<Registration> registrations;
    

}
