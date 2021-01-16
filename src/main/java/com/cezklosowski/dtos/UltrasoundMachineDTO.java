package com.cezklosowski.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UltrasoundMachineDTO {

    private Long ultrasoundMachineId;
    private String serialNumber;
    private String modelName;
    private String manufacturerName;
    private LocalDate productionDate;
}
