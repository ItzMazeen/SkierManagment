package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Registration")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdReg")
    private Long IdReg;

    private Long numRegistration;
    private int numWeek;

    @ManyToOne
    private Skier skier;

    @ManyToOne
    private Course course;
}
