package com.cezklosowski.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class LoanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loanId;

    @OneToMany(
           // mappedBy = "loanEntity"
    )
    private Set<UltrasoundMachineEntity> ultrasoundMachines = new HashSet<>();

    private String placeName;
    private LocalDate startTime;
    private LocalDate endTime;

}