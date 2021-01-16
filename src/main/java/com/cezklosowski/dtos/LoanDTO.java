package com.cezklosowski.dtos;

import com.cezklosowski.entities.UltrasoundMachineEntity;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class LoanDTO {

    private long loanId;
    private String placeName;
    private LocalDate startTime;
    private LocalDate endTime;
    private Set<UltrasoundMachineEntity> ultrasoundMachines = new HashSet<>();
}
