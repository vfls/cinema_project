package com.personal.CinemaProject.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@ManyToMany
@Entity
public class Movies {
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    @Id
    private Integer id;

    private String title;

    private Integer runtime;

    private Date premierDate;

    private String genre;

    private String synopsis;

}
