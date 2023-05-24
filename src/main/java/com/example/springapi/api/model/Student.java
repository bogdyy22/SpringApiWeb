package com.example.springapi.api.model;

public class Student {

    private long id;
    private String name;
    private String facult;
    private String courses;

    public Student(long id, String name, String facult, String courses) {
        this.id = id;
        this.name = name;
        this.facult = facult;
        this.courses = courses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacult() {
        return facult;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}

