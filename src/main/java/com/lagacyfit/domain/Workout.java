package com.lagacyfit.domain;

import java.util.List;

/**
 * Created by stevenmcdonald on 11/28/16.
 */
public class Workout {

    private Long id;
    private List<WorkoutList> workoutList;

    public List<WorkoutList> getWorkoutList() {
        return workoutList;
    }

    public void setWorkoutList(List<WorkoutList> workoutList) {
        this.workoutList = workoutList;
    }
}
