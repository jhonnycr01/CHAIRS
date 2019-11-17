package ui;

import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        University university = new University();
        int basicOperation;
        int line;
        String lineL;
        int chairNumber;
        String nameEvent;
        String date;
        int timeStart;
        int timeEnds;
        String teacherName;
        String facultyName;
        int peopleTotal;
        String description;
        int quantityChairsByRow[];
        String letters[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z" };

        do {
            System.out.println("what option would you like to do (if you would like to exit enter -1) \n"
                    + "1. create a chair \n" + "2. report a damage chair \n" + "3. percentage of damage chairs \n"
                    + "4. register a event");
            basicOperation = reader.nextInt();
            reader.nextLine();

            switch (basicOperation) {
            case 1:
                System.out.println("por favor introduce el nombre del auyditrorio");
                String audienceName = reader.nextLine();
                System.out.println("please enter the location of the audience");
                String localitation = reader.nextLine();
                System.out.println("please enter the total time ");
                int totalTime = reader.nextInt();
                System.out.println("please enter the status of the audience");
                String status = reader.nextLine();
                Audience audience = new Audience(audienceName, localitation, totalTime, status);
                System.out.println("please enter the total of line of the audience");
                line = reader.nextInt();
                quantityChairsByRow = new int[line];
                for (int x = 0; x < line; x++) {
                    System.out.println("number of chair the line " + letters[x] + ": ");
                    quantityChairsByRow[x] = reader.nextInt();
                }

                audience.createChairs(quantityChairsByRow);
                university.addAudience(audience);

                break;

            case 2:
                System.out.println("please enter the line of the chair");
                line = reader.nextInt();
                System.out.println("please enter the number of the chair");
                chairNumber = reader.nextInt();
                System.out.println("please enter the description of the damage chair");
                description = reader.nextLine();
                break;

            case 3:

                break;

            case 4:
                System.out.println("please enter the name of the event");
                nameEvent = reader.nextLine();
                System.out.println("please enter the date of the event ");
                date = reader.nextLine();
                System.out.println("please enter the initial time of the event (with out minutes)");
                timeStart = reader.nextInt();
                System.out.println("please enter the final time of the event( with out minutes)");
                timeEnds = reader.nextInt();
                System.out.println("please enter the name of the teacher of the event");
                teacherName = reader.nextLine();
                System.out.println("please enter the name of the faculty of the event");
                facultyName = reader.nextLine();
                System.out.println(" please enter the total of people attending to the event");
                peopleTotal = reader.nextInt();
            }

        } while (basicOperation != -1);
    }
}
