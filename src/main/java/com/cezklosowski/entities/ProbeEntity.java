package com.cezklosowski.entities;

import com.cezklosowski.enums.ProbeType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class ProbeEntity {
    @Id
    @GeneratedValue
    private Long probeId;

    private String serialNumber;
    private String modelName;
    private String manufacturerName;
    private LocalDate productionDate;
    private double minFrequency;
    private double maxFrequency;
    private int numberOfElements;
    private ProbeType type;
    @ElementCollection
    private List<String> matchingUltrasoundMachines;
    @ManyToMany
    private Set<LoanEntity> loans = new HashSet<>();
}
