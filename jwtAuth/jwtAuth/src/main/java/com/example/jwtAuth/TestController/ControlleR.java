package com.example.jwtAuth.TestController;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControlleR {
    @GetMapping("/")
    public String geet(HttpServletRequest req) {
        return ("Hello " + req.getSession().getId());
    }

}
