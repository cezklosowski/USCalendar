package com.cezklosowski.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private int licznik = 0;

    public String fetchHelloMessage() {
        return "Witaj! Wszystko działa. Odświeżono  " + (++licznik) + " razy.";
    }
}
