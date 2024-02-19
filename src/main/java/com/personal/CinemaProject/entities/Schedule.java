package com.personal.CinemaProject.entities;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Schedule {

    private Date premierDate;

    private List<LocalTime> avaliableSessions;

    private List<LocalTime> pastSessions;
}
