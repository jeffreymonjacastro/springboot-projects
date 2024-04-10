package com.jamcycoding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Lecture {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    // Relationship Lecture
    // Many Lectures belong to one Section
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    // Relationship Resource
    // One Resourse have One Lecture
    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
}
