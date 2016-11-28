package com.lagacyfit.domain;

/**
 * Created by stevenmcdonald on 11/28/16.
 */
public class User {
    private long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private Workout workout;
    private WorkoutList workoutList;

    private boolean enabled = true;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    @Override
    public String toString() {
        return "User [Id=" + id + ", username=" + userName  + ", password=" + password + ", firstName= " + firstName
                + ", lastName=" + lastName + ", email=" + email + ", phone=" + phoneNumber + ", address=" + address +
                ", city=" + city + ", state=" + state + ", zip code=" + zipCode;
    }

    public WorkoutList getWorkoutList() {
        return workoutList;
    }

    public void setWorkoutList(WorkoutList workoutList) {
        this.workoutList = workoutList;
    }
}