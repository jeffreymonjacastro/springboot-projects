package com.jamcycoding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

// lombok package
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // Design pattern Builder
@Entity // Declare this class an Entity (Table)
//@Table(name = "Author_tbl")
public class Author {

    @Id // Declare the attribute as the key

    // Generates autoincrement number
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )

    // Sequence used in the table
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1 // 1 2 3 4 5....
    )
    private Integer id;

    @Column(
            length = 30,
            nullable = false
    )
    private String firstName;
    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;

//    @Column(
//            updatable = false,
//            nullable = false
//    )
//    private LocalDateTime created;

//    @Column(
//            insertable = false,
//            nullable = false
//    )
//    private LocalDateTime lastModified;

    // Relationship Course
    // An Author can have MANY Courses
    // Author will be the inverse owner
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
