import java.util.Scanner;
 
//JHTP Exercise 7.12: Duplicate Elimination
//by pandenghuang@163.com
/**7.19 (Airline Reservations System) A small airline has just purchased a computer for its new automated
reservations system. You’ve been asked to develop the new system. You’re to write an application to 
assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and Please type 2 
for Economy. If the user types 1, your application should assign a seat in the firstclass section (seats 1–5). 
If the user types 2, your application should assign a seat in the economy section (seats 6–10). 
Your application should then display a boarding pass indicating the person’s seat number and whether 
it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the plane. 
Initialize all the elements of the array to false to indicate that all the seats are empty. 
As each seat is assigned, set the corresponding element of the array to true to indicate that the 
seat is no longer available.
Your application should never assign a seat that has already been assigned. 
When the economy section is full, your application should ask the person if it’s acceptable 
to be placed in the first-class section (and vice versa). If yes, make the appropriate seat assignment. 
If no, display the message "Next flight leaves in 3 hours."*/
 
 
public class AirlineReservation {
 
	 static final int FIRSTCLASSCAPACITY = 3,ECOCAPICCAPACITY = 7; //First class, economy class seat allocation
	  static final int FIRSTCLASS = 1; //1 is first class
	  static final int ECONOMIC = 2; // 2 is economy class
	  static int[] seatNum=new int[FIRSTCLASSCAPACITY+ECONOMICCAPACITY]; //seat number
	  static boolean[] seatStatus=new boolean[FIRSTCLASSCAPACITY+ECONOMICCAPACITY]; //true means scheduled
	  static int firstClassAvailable = FIRSTCLASSCAPACITY; //Reservable first class seats
	  static int economicAvailable = ECONOMICCAPACITY; //reservable economy class seats
           static int seatType= 0; //User selected cabin type
           static int seatNumber = 0; //The seat number specified by the system for the user
	 static Scanner input=new Scanner(System.in);
 
 public static void main(String[] args)
 {
 
	  for (int i=0;i<seatNum.length;i++) //Assign the seat number
         seatNum[i]=i+1;  
     
           System.out.println("Flight Scheduler:");
     
 
		
		do{
			 System.out.print ("Please enter 1 for first class booking, 2 for economy class booking (input -1 exit):");
			seatType =input.nextInt();
			if(seatType ==-1){
				 System.out.printf ("Exited Program");
				break;
			}
			
			if (seatType == FIRSTCLASS)
			bookFirstClass();
			else if (seatType == ECONOMIC)
			bookEconomic();
 
				
			} while (seatType != -1 && !(economicAvailable ==0 && firstClassAvailable ==0));
		
		input.close();
 }
    
 public static void bookFirstClass() {
	 
	 If (firstClassAvailable >0); { //Check if the first class is available
		 for (int i=0;i<FIRSTCLASSCAPACITY;i++)
	     {
	         if (seatStatus[i]!=true)
	         {
	             seatNumber=seatNum[i];
	             seatStatus[i]=true;
	             firstClassAvailable--;
	              System.out.printf ("You have successfully booked First Class, Class Type: First Class, Seat Number: %d%n", seatNumber);
	             break;
	         }
	     }
	}
          if(economicAvailable > 0); //If the first class is full, check if the economy class has a seat
         {
                   System.out.printf ("Sorry, the first class is full, if you need to book economy class, you can enter 2:");
         seatType =input.nextInt();	
			if (seatType==2)
				 bookEconomic(); //Book economy class
         
    }
    else  (economicAvailable ==0 && firstClassAvailable ==0){
    	     System.out.println("Sorry, all flights on this flight are full, please check other flights.");
 }
 
 
 public static void bookEconomic() {
	 
		 if (economicAvailable > 0) { //Check if economy class is available
			 for (int i=FIRSTCLASSCAPACITY;i<FIRSTCLASSCAPACITY+ECONOMICCAPACITY;i++)
		     {
		         if (seatStatus[i]!=true)
		         {
		             seatNumber=seatNum[i];
		             seatStatus[i]=true;
		             economicAvailable--;
		              System.out.printf ("You have successfully booked Economy Class, Class of Service: Economy Class, Seat Number: %d%n", seatNumber);
		             break;
		         }
		     }
		}
	     else if(firstClassAvailable > 0); //If the first class is full, check if the economy class has a seat
	         {
	          System.out.printf ("Sorry, economy class is full, if you need to book first class, you can enter 1:");
				seatType =input.nextInt();
				if (seatType==1)
					 bookFirstClass(); //decome first class
	         
	    }
	    else  (economicAvailable ==0 && firstClassAvailable ==0) {
	    	 System.out.println("Sorry, all flights on this flight are full, please check other flights.");
	 }
	 
 }