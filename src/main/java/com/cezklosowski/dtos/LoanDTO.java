package com.cezklosowski.dtos;

import com.cezklosowski.entities.UltrasoundMachineEntity;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class LoanDTO {

    private long loanId;
    private String placeName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Set<UltrasoundMachineEntity> ultrasoundMachines = new HashSet<>();
}
