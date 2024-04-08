package com.jamcycoding.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok package
@Data
@NoArgsConstructor
@Entity // Declare this class an Entity (Table)
public class Author {
    @Id // Declare the attribute as the key
    @GeneratedValue // Generates autoincrement number
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
