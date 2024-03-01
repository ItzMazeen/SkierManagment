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
@Table(name="Subscription")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdSub")
    private Long IdSub;

    private Long numSub;
    private Date startDate;
    private Date endDate;
    private float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;




}
