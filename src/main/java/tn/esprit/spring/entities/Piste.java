package tn.esprit.spring.entities;
import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Piste")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPiste")
    private Long idPiste;

    private Long numPiste;
    private String namePiste;
    private int length;
    private int slope;

    @Enumerated(EnumType.STRING)
    private Color color;

    @ManyToMany(mappedBy = "pistes")
    private Set<Skier> skiers;




}
