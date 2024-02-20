package com.personal.CinemaProject.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Table(name = "tickets")

@Entity
public class Tickets {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "available_tickets")
    private Integer availableTickets;

    @Column(name = "reserved_tickets")
    private Integer reservedTickets;

    @Column(name = "total_tickets")
    private Integer totalTickets;

    @Column(name = "price")
    private BigDecimal price;

}
