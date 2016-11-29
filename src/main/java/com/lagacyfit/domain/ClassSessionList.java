package com.lagacyfit.domain;

import java.util.Date;

/**
 * Created by stevenmcdonald on 11/28/16.
 */
public class ClassSessionList {

    private Long id;
    private Date date;
    private String description;
    private String classType;
    private String location;
    private String instructorName;

    private ClassSession classSession;

    public ClassSessionList(Date date, String description, String classType, String location, String instructorName,
                            ClassSession classSession) {
        super();
        this.date = date;
        this.description = description;
        this.classType = classType;
        this.location = location;
        this.instructorName = instructorName;
        this.classSession = classSession;
    }

    public ClassSessionList() {}

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

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
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

    public ClassSession getClassSession() {
        return classSession;
    }

    public void setClassSession(ClassSession classSession) {
        this.classSession = classSession;
    }
}
