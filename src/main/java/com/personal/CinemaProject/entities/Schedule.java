package com.personal.CinemaProject.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Table(name = "movie_schedule")

@Entity
public class Schedule {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "premier_date")
    private ZonedDateTime premierDate;

    @Column(name = "end_exhibition")
    private ZonedDateTime endExhibition;

    @Column(name = "next_session")
    private ZonedDateTime nextSession;

    @Column(name = "current_session")
    private ZonedDateTime currentSession;

    @Column(name = "past_session")
    private ZonedDateTime pastSession;
}
