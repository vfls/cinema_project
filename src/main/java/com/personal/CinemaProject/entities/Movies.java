package com.personal.CinemaProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "movies")
public class Movies {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "runtime")
    private Integer runtime;

    @Column(name = "genre")
    private String genre;

    @Column(name = "synopsis")
    private String synopsis;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private boolean active;
}
