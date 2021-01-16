package com.cezklosowski.thymeleafControllers;

import com.cezklosowski.services.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FrontendController {
    private final HelloService helloService;


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("powitanie", helloService.fetchHelloMessage());
        return "index";
    }
}

