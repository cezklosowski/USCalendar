package com.cezklosowski.restControllers;

import com.cezklosowski.dtos.LoanDTO;
import com.cezklosowski.services.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rest/loans")
public class LoanController {

    private final LoanService loanService;

    @GetMapping
    public List<LoanDTO> getAll() {
        return loanService.getAllLoans();
    }
}
