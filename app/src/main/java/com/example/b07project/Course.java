package com.example.b07project;

import java.util.ArrayList;

public class Course {
    private String courseCode;
    private ArrayList prerequisite;
    private String name;
    private String offeringSessions;


    public Course(){


    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public ArrayList getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(ArrayList prerequisite) {
        this.prerequisite = prerequisite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfferingSessions() {
        return offeringSessions;
    }

    public void setOfferingSessions(String offeringSessions) {
        this.offeringSessions = offeringSessions;
    }
}
