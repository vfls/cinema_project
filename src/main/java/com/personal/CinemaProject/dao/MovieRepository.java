package com.personal.CinemaProject.dao;

import com.personal.CinemaProject.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movies, Integer> {
}
