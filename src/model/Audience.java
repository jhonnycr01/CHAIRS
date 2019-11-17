package model;

import java.util.*;

public class Audience {
    private String name;
    private String location;
    private int totalTime;
    private String status;
    private Chair chairs[][];
    private String letters[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
            "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

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

    public void createChairs(int[] quantiyCharisByRow) {
        int columns = maxValue(quantiyCharisByRow);
        int rows = quantiyCharisByRow.length;
        int counter = 1;
        chairs = new Chair[rows][columns];
        for (int i = 0; i < quantiyCharisByRow.length; i++) {
            for (int j = 0; j < quantiyCharisByRow[i]; j++) {
                chairs[i][j] = new Chair(letters[i], counter);
                counter++;
            }
        }
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