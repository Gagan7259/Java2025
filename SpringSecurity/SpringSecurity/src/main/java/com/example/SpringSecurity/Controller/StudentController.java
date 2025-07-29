package com.example.SpringSecurity.Controller;


import com.example.SpringSecurity.model.Student;
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

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Gagan", 78),
            new Student(2, "Masnoj", 89),
            new Student(3, "Nagesh", 93),
            new Student(4, "Mouni", 46),
            new Student(5, "sai", 67),
            new Student(6, "Bhavani", 56)

    ));

    @GetMapping("/getallstudents")
    public List<Student> getallstudents() {
        return students;
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
@GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest req) {
        return (CsrfToken) req.getAttribute("_csrf");
    }


}
