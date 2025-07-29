package com.example.SpringSecurity.model;


import lombok.*;

//@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private int marks;
}
