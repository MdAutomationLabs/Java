import java.util.Scanner;


public class TicketCounterAhmed {

	public static void main(String[] args) {
		
		// Md Ahmed
		int customer = 0;
		int minTicket = 1;
		int maxTicket = 6;
		int  totalTicket= 75;
		int totalSold = 75;
		int ticketForEach = 0;
		
		Scanner in = new Scanner(System.in);
	   
		while (totalTicket > 0) 
	     {
	    	System.out.print("How many ticket would you like to purchase (not more than six): "); 
	    	ticketForEach = in.nextInt();
	    if ((ticketForEach > minTicket && ticketForEach <= maxTicket) && (ticketForEach <= totalTicket))
	    	{
	    	totalTicket= totalTicket - ticketForEach;
	    		System.out.println("Remaining tickets: "+totalTicket);
	    		customer++;
	    	}
	    	else {
	    		System.out.println("We have left olny "+totalTicket+" tickets: ");
	    	}
	     }
	    	System.out.println("Total ticket sold " +totalSold+ " to " +customer+ " customer.");
	    	System.out.println("Thanks you.");
	    in.close();
	    }
	}



