package com.cezklosowski.restControllers;

import com.cezklosowski.services.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloService helloService;

    @GetMapping(value = "/hello", produces = "text/plain")
    public String hello() {
        return helloService.fetchHelloMessage();
    }
}
