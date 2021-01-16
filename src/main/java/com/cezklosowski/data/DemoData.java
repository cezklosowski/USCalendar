package com.cezklosowski.data;

import com.cezklosowski.entities.LoanEntity;
import com.cezklosowski.entities.UltrasoundMachineEntity;
import com.cezklosowski.repositories.LoanRepository;
import com.cezklosowski.repositories.UltrasoundMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DemoData {

    @Autowired
    private UltrasoundMachineRepository ultrasoundMachineRepository;

    @Autowired
    private LoanRepository loanRepository;

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

        LoanEntity loanEntity1 = new LoanEntity();
        LoanEntity loanEntity2 = new LoanEntity();
        LoanEntity loanEntity3 = new LoanEntity();

        loanEntity1.getUltrasoundMachines().add(ultrasoundMachineEntity1);
        loanEntity1.setPlaceName("EnelMed Gdańsk");
        loanEntity1.setStartTime(LocalDateTime.of(2021,1,19,13,0));
        loanEntity1.setEndTime(LocalDateTime.of(2021,1,24,12,30));
        loanRepository.saveAndFlush(loanEntity1);

        loanEntity2.getUltrasoundMachines().add(ultrasoundMachineEntity3);
        loanEntity2.setPlaceName("Eskulap Warszawa");
        loanEntity2.setStartTime(LocalDateTime.of(2021,1,21,7,15));
        loanEntity2.setEndTime(LocalDateTime.of(2021,1,28,10,30));
        loanRepository.saveAndFlush(loanEntity2);

        loanEntity3.getUltrasoundMachines().add(ultrasoundMachineEntity5);
        loanEntity3.getUltrasoundMachines().add(ultrasoundMachineEntity9);
        loanEntity3.setPlaceName("LuxMed Kraków");
        loanEntity3.setStartTime(LocalDateTime.of(2021,2,1,12,0));
        loanEntity3.setEndTime(LocalDateTime.of(2021,2,7,8,0));
        loanRepository.saveAndFlush(loanEntity3);

    }
}
