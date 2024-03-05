package com.personal.CinemaProject.dao;

import com.personal.CinemaProject.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository <Schedule, Integer> {
}
