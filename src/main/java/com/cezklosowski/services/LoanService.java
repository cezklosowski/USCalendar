package com.cezklosowski.services;

import com.cezklosowski.entities.LoanEntity;
import com.cezklosowski.repositories.LoanRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class LoanService {
    private final LoanRepository loanRepository;

    public List<LoanEntity> getAllLoans() {
        final List<LoanEntity> allLoans = loanRepository.findAll();
        return allLoans;
    }

}

