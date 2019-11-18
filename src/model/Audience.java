package model;

import java.util.ArrayList;

/**
 * Audience 
 * @author Jhonny 
 *
 */
public class Audience {
    private String name;
    private ArrayList<Event> events;
    private String location;
    private int totalTime;
    private String status;
    private Chair chairs[][];
    /**
	 * Array of letter for rows of the audiences
	 */
    private String letters[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

    /**
     * Create an audience
     * @param name with identify the audience
     * @param location of the audience
     * @param totalTime available of audience
     * @param status of audience
     */
    public Audience(String name, String location, int totalTime, String status) {
        this.name = name;
        this.location = location;
        this.totalTime = totalTime;
        this.status = status;
    }

    public Chair[][] getChairs() {
        return chairs;
    }

    private int maxValue(int[] numbers) {
        int max = numbers[0];
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] > max) {
                max = numbers[x];
            }
        }
        return max;
    }

    /**
     * createChairs creates the chair in matrix, 
     * @param quantiyCharisByRow array with quantity of chairs by row
     */
    public void createChairs(int[] quantiyCharisByRow) {
        int columns = maxValue(quantiyCharisByRow);
        int rows = quantiyCharisByRow.length;
        int counter;
        chairs = new Chair[rows][columns];
        for (int i = 0; i < quantiyCharisByRow.length; i++) {
        	//Se usa el counter aqui porque reinicia el conteno de las sillas
        	//Tal como se usa en los cines
        	counter = 1;
            for (int j = 0; j < quantiyCharisByRow[i]; j++) {
                chairs[i][j] = new Chair(letters[i], counter);
                counter++;
            }
        }
    }
    
    /**
     * percentDamageChair
     * 
     * @return percent of damage chairs 
     */
    public float percentDamageChair() {
    	float percent = 0;
    	int rows = chairs.length;
    	int columns = chairs[0].length;
    	int countDamageChair = 0;
    	int countTotalChairs = 0;
    	for(int x=0;x<rows;x++) {
    		for(int y=0;y<columns;y++) {
    			Chair chair = chairs[x][y]; 
    			if(chair != null) {
    				countTotalChairs++;
    				if(chair.getStatus().equals("DAMAGE")) {
    					countDamageChair++;
    				}
    			}
    		}
    	}
    	percent = (countDamageChair * 100 ) / countTotalChairs;
    	return percent;
    }
    
    /**
     * Report a damage chair 
     * @param rowChair letter of row 
     * @param numberChair number of chair in row 
     */
    public void reportDamageChair(String rowChair, int numberChair) {
    	int row = getRowByLetter(rowChair);
    	Chair chair = chairs[row][numberChair-1];
    	chair.setStatus("DAMAGE");
    }
    
    private int getRowByLetter(String letter) {
    	int index = 0;
    	for(int x=0;x<letters.length;x++) {
    		if (letters[x].equals(letter)) {
    			index = x;
    			break;
    		}
    	}
    	return index;
    }
    
    public ArrayList<Event> getEvents(){
    	return this.events;
    }
    
    public void addEvent(Event event) {
    	this.events.add(event);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}