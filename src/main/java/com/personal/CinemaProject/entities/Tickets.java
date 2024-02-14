package com.personal.CinemaProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "tickets")
@ManyToMany
@Entity
public class Tickets {
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    @Id
    private Integer id;
    private Integer avaliableTickets;
    private Integer reservedTickets;
    private Integer totalTickets;
    private Integer price;

}
