package com.cezklosowski.dtos;

import com.cezklosowski.enums.ProbeType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
public class ProbeDTO {

    private Long probeId;
    private String serialNumber;
    private String modelName;
    private String manufacturerName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate productionDate;
    private double minFrequency;
    private double maxFrequency;
    private int numberOfElements;
    private ProbeType type;
    private List<String> matchingUltrasoundMachines;
}
