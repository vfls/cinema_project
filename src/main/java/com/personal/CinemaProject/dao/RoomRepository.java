package com.personal.CinemaProject.dao;

import com.personal.CinemaProject.entities.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Rooms, Integer> {
}
