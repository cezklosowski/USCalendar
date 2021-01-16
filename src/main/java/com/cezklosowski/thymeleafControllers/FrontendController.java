package com.cezklosowski.thymeleafControllers;

import com.cezklosowski.dtos.LoanDTO;
import com.cezklosowski.services.HelloService;
import com.cezklosowski.services.LoanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Log4j2
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

    @GetMapping("/addLoan")
    public String addLoan(Model model) {
        model.addAttribute("loanDTO", new LoanDTO());
        return "addLoan";
    }

    @PostMapping("/addLoan")
    public String postAddLoan(Model model, LoanDTO loanDTO) {
        log.info("Dodatno nowe wypożyczenie: " + loanDTO);
        loanService.addNewLoan(loanDTO);
        return "redirect:/";
    }
}

