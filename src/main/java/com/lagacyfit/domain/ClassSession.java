package com.lagacyfit.domain;

import java.util.List;

/**
 * Created by stevenmcdonald on 11/28/16.
 */
public class ClassSession {

    private Long id;
    private List<ClassSessionList> classSessionList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ClassSessionList> getClassSessionList() {
        return classSessionList;
    }

    public void setClassSessionList(List<ClassSessionList> classSessionList) {
        this.classSessionList = classSessionList;
    }
}
