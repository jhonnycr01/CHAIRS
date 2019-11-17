package model;

public class event {
    private String name;
    private String date;
    private int timeStart;
    private int timeEnds;
    private String teacherName;
    private String facultyName;
    private int peopleTotal;

    public event(String name, String date, int timeStart, int timeEnds, String teacherName, String facultyName,
            int peopleTotal) {
        this.name = name;
        this.date = date;
        this.timeStart = timeStart;
        this.timeEnds = timeEnds;
        this.teacherName = teacherName;
        this.facultyName = facultyName;
        this.peopleTotal = peopleTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeEnds() {
        return timeEnds;
    }

    public void setTimeEnds(int timeEnds) {
        this.timeEnds = timeEnds;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getPeopleTotal() {
        return peopleTotal;
    }

    public void setPeopleTotal(int peopleTotal) {
        this.peopleTotal = peopleTotal;
    }
}