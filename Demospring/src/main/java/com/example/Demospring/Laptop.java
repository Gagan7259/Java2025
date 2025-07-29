package com.example.Demospring;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile() {
        System.out.println("Compiled succesfully");
    }

    public void debug() {
        System.out.println("Debugg succesfully");
    }


}
