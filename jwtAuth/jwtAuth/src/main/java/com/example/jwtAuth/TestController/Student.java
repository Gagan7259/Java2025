package com.example.jwtAuth.TestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private int marks;
}
