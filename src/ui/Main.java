package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class Main {
	/**
	 * Array of letter for rows of the audiences
	 */
	private static String letters[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z" };
	public static enum Opcion { REPORT_DAMAGE_CHAIR, PERCENT_DAMAGE_CHAIR, CREATE_EVENT };
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        University university = new University("ICESI");
        Audience audience1 = new Audience("Sala 1","Bloque 1", 10,"ACTIVE");
        audience1.createChairs(new int[]{10,12});
        Audience audience2 = new Audience("Sala 2","Bloque 2", 10,"ACTIVE");
        audience2.createChairs(new int[]{10,12,14});
        university.addAudience(audience1);
        university.addAudience(audience2);
        
        
        int option;


        // variables for use
        int quantityChairsByRow[];
        int line;
        String audienceName;
        String localitation;
        int totalTime;
        String status;
        Audience audience;
        


        do {
        	
        	System.out.println("\n\n\n\n\n\n");
            System.out.println("Ingresa la opcion \n"
            + "1. Crear Auditorio \n" 
            + "2. Listar Auditorios \n"
            + "3. Report damage chair\n" 
            + "4. Percent damage Chair\n"
            + "5. Crear evento en un auditorio \n"
            + "0. Salir \n\n");
            System.out.print("ingresa opcion: ");
            option = reader.nextInt();
            reader.nextLine();
            
            switch(option) {
            case 1:
            	
            	
            	//request for information
            	System.out.println("por favor introduce el nombre del auditorio");
                audienceName = reader.nextLine();
                
                System.out.println("please enter the location of the audience");
                localitation = reader.nextLine();
                
                System.out.print("please enter the total time: ");
                totalTime = reader.nextInt();
                reader.nextLine();
                
                System.out.println("please enter the status of the audience");
                status = reader.nextLine();
                
                //Create Audience 
                audience = new Audience(audienceName, localitation, totalTime, status);
                
                //Create Chairs
                System.out.print("please enter the total of line of the audience: ");
                line = reader.nextInt();
                
                quantityChairsByRow = new int[line];
                
                for (int x = 0; x < line; x++) {
                    System.out.print("number of chair the line " + letters[x] + ": ");
                    quantityChairsByRow[x] = reader.nextInt();
                }

                audience.createChairs(quantityChairsByRow);
                university.addAudience(audience);

            	break;
            case 2:
            	listAudience(university);
            	System.out.println("presione cualquier telca para continuar...");
            	reader.nextLine();
            	System.out.flush();
            	break;
            case 3:
            	//Report Damage CHAIR
            	menuAudience(university, reader, Opcion.REPORT_DAMAGE_CHAIR);
            	
            	break;
            case 4:
            	// Percent Damage Chairs
            	menuAudience(university, reader, Opcion.PERCENT_DAMAGE_CHAIR);
            	break;
            case 5:
            	//Create Event Audience
            	menuAudience(university, reader, Opcion.CREATE_EVENT);
            case 0:
            	System.out.println("Bye!");
            	break;
            }
            
        } while(option != 0);
        reader.close();

       
    }
    
    /**
     *listAudience
     * @param university with audiences   
     * List the audiences of the university
     * */
    public static void listAudience(University university) {
    	ArrayList<Audience> audiences =university.getAudiences();
    	System.out.println("\n===============================");
    	for(int x =0; x< audiences.size();x++) {
    		System.out.println((x+1)+". : " + audiences.get(x).getName());
    	}
    	System.out.println("===============================\n");
    	
    	
    }

    /**
     * 
     * @param university with all data 
     * @param reader for request data 
     * @param basicOperation type of operate
     */
    public static void menuAudience(University university, Scanner reader, Opcion basicOperation) {
    	
        
        String rowChair;
        int numberChair;

        String nameEvent;
        String date;
        int timeStart;
        int timeEnds;
        String teacherName;
        String facultyName;
        int peopleTotal;
        float percentDamageChair;
        int audienceNumber;
        
        listAudience(university);
    	System.out.print("Selecciona el numero Auditorio: ");
    	audienceNumber = reader.nextInt();
    	Audience audience = university.getAudiences().get(audienceNumber-1);

        switch (basicOperation) {
            case REPORT_DAMAGE_CHAIR:
            	//Report Damage Chair
            	System.out.println("Please enter the row of the chair to report");
            	rowChair = reader.nextLine();
            	
            	System.out.print("Please enter the number of the chair to report: ");
            	numberChair = reader.nextInt();
            	reader.nextLine();
            	audience.reportDamageChair(rowChair, numberChair);
            	
                break;

            case PERCENT_DAMAGE_CHAIR:
            	percentDamageChair = audience.percentDamageChair();
            	System.out.println("percentage of damage chairs: "+ percentDamageChair);
                break;

            case CREATE_EVENT:
            	
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
                
                Event event = new Event(nameEvent,date,timeStart,timeEnds,teacherName,facultyName,peopleTotal);
                audience.addEvent(event);

                break;

        }

    }
}
