package com.cezklosowski.controllers;

import com.cezklosowski.entities.LoanEntity;
import com.cezklosowski.services.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/loan")
public class LoanController {

    private final LoanService loanService;

    @GetMapping
    public List<LoanEntity> getAll() {
        return loanService.getAllLoans();
    }
}
