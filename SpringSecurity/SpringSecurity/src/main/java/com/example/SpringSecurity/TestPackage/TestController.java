package com.example.SpringSecurity.TestPackage;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String greet(HttpServletRequest req){
        return  "Hello Workld"+req.getSession().getId();
    }
}
