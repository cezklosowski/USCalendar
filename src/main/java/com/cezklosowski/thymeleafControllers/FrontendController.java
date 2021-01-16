package com.cezklosowski.thymeleafControllers;

import com.cezklosowski.dtos.LoanDTO;
import com.cezklosowski.dtos.UltrasoundMachineDTO;
import com.cezklosowski.services.HelloService;
import com.cezklosowski.services.LoanService;
import com.cezklosowski.services.UltrasoundMachineService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Log4j2
public class FrontendController {
    private final HelloService helloService;
    private final LoanService loanService;
    private final UltrasoundMachineService ultrasoundMachinesService;


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("powitanie", helloService.fetchHelloMessage());
        return "index";
    }

    @GetMapping("/loans")
    public String loans(Model model) {
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

    @GetMapping("/ultrasoundMachines")
    public String ultrasoundMachines(Model model) {
        final List<UltrasoundMachineDTO> allUltrasoundMachines = ultrasoundMachinesService.getAllUltrasoundMachines();
        model.addAttribute("ultrasoundMachines", allUltrasoundMachines);
        return "ultrasoundMachines";
    }
}

