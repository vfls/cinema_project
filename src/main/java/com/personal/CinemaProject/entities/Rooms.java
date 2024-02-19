package com.personal.CinemaProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "rooms")
@ManyToMany
@Entity
public class Rooms {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    Integer totalSeats;
}
