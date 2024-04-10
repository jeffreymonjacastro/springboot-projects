package com.jamcycoding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Section {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int sectionOrder;

    // Relationship Course
    // MANY Sections belongs to a Course
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // Relationship Lecture
    // One section to MANY lectures
    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
