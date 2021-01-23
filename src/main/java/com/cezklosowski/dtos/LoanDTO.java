package com.cezklosowski.dtos;

import com.cezklosowski.entities.UltrasoundMachineEntity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class LoanDTO {

    private long loanId;
    private String placeName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endTime;
    private UltrasoundMachineEntity ultrasoundMachine;
}
