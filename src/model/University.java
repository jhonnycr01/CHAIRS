package model;

import java.util.ArrayList;
/**
 * Class University contains all Audiences 
 */
public class University {

    private ArrayList<Audience> audiences;

    private String name;

    public University(String name) {
        this.name = name;
        this.audiences = new ArrayList<Audience>();
    }

    /**
     * getAudiences
     * @return list of audiences
     */
    public ArrayList<Audience> getAudiences() {
        return this.audiences;
    }

    /**
     * Add audience to the list of audiences
     * @param audience for add to the list audiences
     */
    public void addAudience(Audience audience){
        this.audiences.add(audience);
    }

    public String getName(){
        return this.name;
    }


}