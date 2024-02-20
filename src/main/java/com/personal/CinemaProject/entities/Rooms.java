package com.personal.CinemaProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "rooms")
@Entity
public class Rooms {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "total_seats")
    private Integer totalSeats;

    @Column(name = "available_seats")
    private Integer availableSeats;

    @Column(name = "reserved_seats")
    private Integer reservedSeats;
}
