package com.cezklosowski.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class LoanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loanId;

    @OneToOne
    private UltrasoundMachineEntity ultrasoundMachine;

    private String placeName;
    private LocalDate startTime;
    private LocalDate endTime;

}