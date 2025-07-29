package com.example.jwtAuth.TestController;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentss = new ArrayList<>(List.of(
            new Student(1, "Gagan", 63),
            new Student(2, "Nag", 54),
            new Student(3, "manoj", 89),
            new Student(4, "Sai", 78),
            new Student(5, "Meena", 38),
            new Student(7, "Deep", 55)
    ));

    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return studentss;
    }

    @PostMapping("/createstud")
    public Student CreateStudent(@RequestBody Student student) {
        studentss.add(student);
        System.out.println("Hello");
        return student;
    }

    @GetMapping("/csrf")
    public CsrfToken getcsrfToken(HttpServletRequest req) {
        return (CsrfToken) req.getAttribute("_csrf");
    }

}
