package com.example.Demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemospringApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(DemospringApplication.class, args);

        Dev obj = context.getBean(Dev.class);
        obj.greet();
    }

}
