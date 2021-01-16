package com.cezklosowski.services;

import com.cezklosowski.dtos.LoanDTO;
import com.cezklosowski.entities.LoanEntity;
import com.cezklosowski.mappers.LoanMapper;
import com.cezklosowski.repositories.LoanRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class LoanService {
    private final LoanRepository loanRepository;

    public List<LoanDTO> getAllLoans() {
        final List<LoanEntity> allEntities = loanRepository.findAll();

        final List<LoanDTO> dtosList = allEntities.stream()
                .map(entity -> LoanMapper.toDTO(entity))
                .collect(Collectors.toList());

        return dtosList;
    }

}

