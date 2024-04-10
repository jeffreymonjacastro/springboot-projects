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
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;

    private String url;

    // Relationship Lecture
    // One Resource belongs to One Lecture
    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
