package model;

import java.util.ArrayList;

public class University {

    private ArrayList<Audience> audiences;

    private String name;

    public University(String name) {
        this.name = name;
        this.audiences = new ArrayList<Audience>();
    }

    public ArrayList<Audience> getAudiences() {
        return this.audiences;
    }

    public void addAudience(Audience audience){
        this.audiences.add(audience);
    }

    public String getName(){
        return this.name;
    }


}