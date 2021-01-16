package com.cezklosowski.thymeleafControllers;

import com.cezklosowski.dtos.LoanDTO;
import com.cezklosowski.services.HelloService;
import com.cezklosowski.services.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FrontendController {
    private final HelloService helloService;
    private final LoanService loanService;


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("powitanie", helloService.fetchHelloMessage());
        return "index";
    }

    @GetMapping("/loans")
    public String jobOffers(Model model) {
        final List<LoanDTO> allLoans = loanService.getAllLoans();
        model.addAttribute("loans", allLoans);
        return "loans";
    }
}

