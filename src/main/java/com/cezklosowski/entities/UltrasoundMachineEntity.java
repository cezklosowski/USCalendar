package com.cezklosowski.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class UltrasoundMachineEntity {

    @Id
    @GeneratedValue
    private Long ultrasoundMachineId;

    private String serialNumber;
    private String modelName;
    private String manufacturerName;
    private LocalDate productionDate;


    // private List<Probe> probes;
    // private List<Accessories> accessories;


}
