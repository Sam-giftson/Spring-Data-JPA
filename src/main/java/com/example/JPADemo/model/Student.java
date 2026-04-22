package com.example.JPADemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Component
public class Student {
    @Id
    private int rno;
    private String name;
    private String gender;
    private String technology;

    }

