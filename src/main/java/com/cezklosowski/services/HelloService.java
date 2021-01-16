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

        return "Witaj! Wszystko działa. Odświeżono  " + (++licznik) + " razy.";
    }
}
