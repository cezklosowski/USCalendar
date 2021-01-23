package com.cezklosowski.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate productionDate;


    // private List<ProbeEntity> probes;
    // private List<Accessories> accessories;


}
