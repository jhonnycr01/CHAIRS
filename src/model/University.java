package model;

import java.util.ArrayList;

public class University {

    private ArrayList<Audience> audiences;

    int matriz[][];
    private String line;
    private int chairNumber;
    private String description;
    private String status;
    private double porcentaje;
    private String name;
    private String date;
    private int timeStart;
    private int timeEnds;
    private String teacherName;
    private String facultyName;
    private int peopleTotal;

    public University() {
        this.audiences = new ArrayList<Audience>();
        this.line = line;
        this.chairNumber = chairNumber;
        this.description = description;
        this.status = status;
        this.porcentaje = porcentaje;
        this.name = name;
        this.date = date;
        this.timeStart = timeStart;
        this.timeEnds = timeEnds;
        this.teacherName = teacherName;
        this.facultyName = facultyName;
        this.peopleTotal = peopleTotal;
    }

    public ArrayList<Audience> getAudiences() {
        return this.audiences;
    }

    public void addAudience(Audience audience){
        this.audiences.add(audience);
    }

}