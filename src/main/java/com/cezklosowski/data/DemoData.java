package com.cezklosowski.data;

import com.cezklosowski.entities.LoanEntity;
import com.cezklosowski.entities.ProbeEntity;
import com.cezklosowski.entities.UltrasoundMachineEntity;
import com.cezklosowski.enums.ProbeType;
import com.cezklosowski.repositories.LoanRepository;
import com.cezklosowski.repositories.ProbeRepository;
import com.cezklosowski.repositories.UltrasoundMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class DemoData {

    @Autowired
    private UltrasoundMachineRepository ultrasoundMachineRepository;

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private ProbeRepository probeRepository;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        UltrasoundMachineEntity ultrasoundMachineEntity1 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity2 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity3 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity4 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity5 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity6 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity7 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity8 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity9 = new UltrasoundMachineEntity();
        UltrasoundMachineEntity ultrasoundMachineEntity10 = new UltrasoundMachineEntity();

        ultrasoundMachineEntity1.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity1.setModelName("NX2");
        ultrasoundMachineEntity1.setSerialNumber("942049S001");
        ultrasoundMachineEntity1.setProductionDate(LocalDate.of(2020,11,12));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity1);

        ultrasoundMachineEntity2.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity2.setModelName("NX2");
        ultrasoundMachineEntity2.setSerialNumber("942049S002");
        ultrasoundMachineEntity2.setProductionDate(LocalDate.of(2019,10,12));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity2);

        ultrasoundMachineEntity3.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity3.setModelName("NX3");
        ultrasoundMachineEntity3.setSerialNumber("122029WY01");
        ultrasoundMachineEntity3.setProductionDate(LocalDate.of(2019,12,15));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity3);

        ultrasoundMachineEntity4.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity4.setModelName("NX3");
        ultrasoundMachineEntity4.setSerialNumber("122029WY02");
        ultrasoundMachineEntity4.setProductionDate(LocalDate.of(2019,10,13));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity4);

        ultrasoundMachineEntity5.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity5.setModelName("Juniper");
        ultrasoundMachineEntity5.setSerialNumber("00144AAA001");
        ultrasoundMachineEntity5.setProductionDate(LocalDate.of(2020,7,10));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity5);

        ultrasoundMachineEntity6.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity6.setModelName("Juniper");
        ultrasoundMachineEntity6.setSerialNumber("00144AAA002");
        ultrasoundMachineEntity6.setProductionDate(LocalDate.of(2020,7,18));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity6);

        ultrasoundMachineEntity7.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity7.setModelName("Juniper");
        ultrasoundMachineEntity7.setSerialNumber("00144AAA003");
        ultrasoundMachineEntity7.setProductionDate(LocalDate.of(2019,7,20));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity7);

        ultrasoundMachineEntity8.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity8.setModelName("Redwood");
        ultrasoundMachineEntity8.setSerialNumber("56102BNG001");
        ultrasoundMachineEntity8.setProductionDate(LocalDate.of(2020,9,18));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity8);

        ultrasoundMachineEntity9.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity9.setModelName("Redwood");
        ultrasoundMachineEntity9.setSerialNumber("56102BNG002");
        ultrasoundMachineEntity9.setProductionDate(LocalDate.of(2020,9,19));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity9);

        ultrasoundMachineEntity10.setManufacturerName("Siemens Acuson");
        ultrasoundMachineEntity10.setModelName("Sequoia");
        ultrasoundMachineEntity10.setSerialNumber("99902SQA001");
        ultrasoundMachineEntity10.setProductionDate(LocalDate.of(2020,12,23));
        ultrasoundMachineRepository.saveAndFlush(ultrasoundMachineEntity10);



        ProbeEntity probeEntity1 = new ProbeEntity();
        ProbeEntity probeEntity2 = new ProbeEntity();
        ProbeEntity probeEntity3 = new ProbeEntity();
        ProbeEntity probeEntity4 = new ProbeEntity();
        ProbeEntity probeEntity5 = new ProbeEntity();

        probeEntity1.setManufacturerName("Siemens Acuson");
        probeEntity1.setModelName("11L4");
        probeEntity1.setMinFrequency(3.6);
        probeEntity1.setMaxFrequency(13.0);
        probeEntity1.setNumberOfElements(128);
        probeEntity1.setType(ProbeType.LINEAR);
        probeEntity1.setSerialNumber("54L256P334");
        probeEntity1.setProductionDate(LocalDate.of(2020,11,30));
        probeEntity1.setMatchingUltrasoundMachines(List.of("NX3", "NX3 Elite", "Juniper Select", "Juniper"));
        probeRepository.saveAndFlush(probeEntity1);

        probeEntity2.setManufacturerName("Siemens Acuson");
        probeEntity2.setModelName("5C1");
        probeEntity2.setMinFrequency(1.4);
        probeEntity2.setMaxFrequency(5.0);
        probeEntity2.setNumberOfElements(128);
        probeEntity2.setType(ProbeType.CONVEX);
        probeEntity2.setSerialNumber("9234BN0114");
        probeEntity2.setProductionDate(LocalDate.of(2021,1,2));
        probeEntity2.setMatchingUltrasoundMachines(List.of("Juniper Select", "Juniper"));
        probeRepository.saveAndFlush(probeEntity2);

        probeEntity3.setManufacturerName("Siemens Acuson");
        probeEntity3.setModelName("9C3");
        probeEntity3.setMinFrequency(2.2);
        probeEntity3.setMaxFrequency(9.2);
        probeEntity3.setNumberOfElements(384);
        probeEntity3.setType(ProbeType.CONVEX);
        probeEntity3.setSerialNumber("03344N0214");
        probeEntity3.setProductionDate(LocalDate.of(2021,1,1));
        probeEntity3.setMatchingUltrasoundMachines(List.of("Sequoia"));
        probeRepository.saveAndFlush(probeEntity3);

        probeEntity4.setManufacturerName("Siemens Acuson");
        probeEntity4.setModelName("9EC4");
        probeEntity4.setMinFrequency(2.9);
        probeEntity4.setMaxFrequency(8.1);
        probeEntity4.setNumberOfElements(192);
        probeEntity4.setType(ProbeType.ENDOCAVITARY);
        probeEntity4.setSerialNumber("81524G3214");
        probeEntity4.setProductionDate(LocalDate.of(2020,5,6));
        probeEntity4.setMatchingUltrasoundMachines(List.of("Sequoia"));
        probeRepository.saveAndFlush(probeEntity4);

        probeEntity5.setManufacturerName("Siemens Acuson");
        probeEntity5.setModelName("5P1");
        probeEntity5.setMinFrequency(1.1);
        probeEntity5.setMaxFrequency(4.8);
        probeEntity5.setNumberOfElements(90);
        probeEntity5.setType(ProbeType.PHASED_ARRAY);
        probeEntity5.setSerialNumber("38588G3214");
        probeEntity5.setProductionDate(LocalDate.of(2019,9,26));
        probeEntity5.setMatchingUltrasoundMachines(List.of("Juniper Select", "Juniper"));
        probeRepository.saveAndFlush(probeEntity5);

        LoanEntity loanEntity1 = new LoanEntity();
        LoanEntity loanEntity2 = new LoanEntity();
        LoanEntity loanEntity3 = new LoanEntity();

        loanEntity1.setUltrasoundMachine(ultrasoundMachineEntity1);
        loanEntity1.getProbes().add(probeEntity1);
        loanEntity1.getProbes().add(probeEntity2);
        loanEntity1.setPlaceName("EnelMed Gdańsk");
        loanEntity1.setStartTime(LocalDate.of(2021,1,19));
        loanEntity1.setEndTime(LocalDate.of(2021,1,24));
        loanRepository.saveAndFlush(loanEntity1);

        loanEntity2.setUltrasoundMachine(ultrasoundMachineEntity3);
        loanEntity2.getProbes().add(probeEntity1);
        loanEntity2.setPlaceName("Eskulap Warszawa");
        loanEntity2.setStartTime(LocalDate.of(2021,1,21));
        loanEntity2.setEndTime(LocalDate.of(2021,1,28));
        loanRepository.saveAndFlush(loanEntity2);

        loanEntity3.setUltrasoundMachine(ultrasoundMachineEntity10);
        loanEntity3.getProbes().add(probeEntity3);
        loanEntity3.getProbes().add(probeEntity4);
        loanEntity3.setPlaceName("LuxMed Kraków");
        loanEntity3.setStartTime(LocalDate.of(2021,2,1));
        loanEntity3.setEndTime(LocalDate.of(2021,2,7));
        loanRepository.saveAndFlush(loanEntity3);


    }
}
