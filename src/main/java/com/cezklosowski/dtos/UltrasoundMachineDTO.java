package com.cezklosowski.dtos;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class UltrasoundMachineDTO {

    private Long ultrasoundMachineId;
    private String serialNumber;
    private String modelName;
    private String manufacturerName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate productionDate;
}
