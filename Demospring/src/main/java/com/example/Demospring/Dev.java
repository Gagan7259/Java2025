package com.example.Demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Dev {
@Autowired
    Laptop laptop;
    @RequestMapping()
    public void greet() {
        laptop.compile();
        laptop.debug();
        System.out.println("Hello World");;
    }
}
