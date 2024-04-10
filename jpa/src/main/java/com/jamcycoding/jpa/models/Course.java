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
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    // Relationship Author
    // A course can be done of MANY Authors
    // This will be the owner of the relationship
    @ManyToMany
    @JoinTable(
        name = "authors_courses",
        joinColumns = {
            @JoinColumn(name = "course_id") // Owner
        },
        inverseJoinColumns = {
            @JoinColumn(name = "author_id") // inverse
        }
    )
    private List<Author> authors;

    // Relationship Section
    // A Course can have MANY sections
    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
