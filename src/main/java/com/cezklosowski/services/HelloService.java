package com.cezklosowski.services;

import com.cezklosowski.entities.LoanEntity;
import com.cezklosowski.repositories.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final LoanRepository loanRepository;

    private int licznik = 0;

    public String fetchHelloMessage() {
        final LoanEntity loanEntity = new LoanEntity();
        loanEntity.setDeviceName("Juniper");
        loanEntity.setPlaceName("Eskulap Gdańsk");
        loanEntity.setStartTime(LocalDate.of(2021,01,11));
        loanEntity.setEndTime(LocalDate.of(2021,01,19));
        loanRepository.save(loanEntity);

        return "Witaj! Wszystko działa. Odświeżono  " + (++licznik) + " razy.";
    }
}
