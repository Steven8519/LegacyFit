package com.lagacyfit.domain;

import java.util.Date;

/**
 * Created by stevenmcdonald on 11/28/16.
 */
public class WorkoutList {

    private Long id;
    private Date date;
    private String description;
    private String workoutType;
    private String location;
    private String instructorName;
    private Workout workout;

    public WorkoutList(Date date, String description, String workoutType, String location, String instructorName, Workout workout) {
        super();
        this.date = date;
        this.description = description;
        this.workoutType = workoutType;
        this.location = location;
        this.instructorName = instructorName;
        this.workout = workout;
    }

    public WorkoutList() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
