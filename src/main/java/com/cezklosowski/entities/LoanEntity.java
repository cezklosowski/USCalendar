package com.cezklosowski.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class LoanEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String deviceName;
    private String placeName;
    private LocalDate startTime;
    private LocalDate endTime;

}