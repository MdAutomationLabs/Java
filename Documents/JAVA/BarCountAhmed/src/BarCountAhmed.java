import java.util.Scanner;


public class BarCountAhmed {

	public static void main(String[] args) {
		//md
     final int MAX_CUSTOMER = 125;
     boolean full = false;
     int totalCustomer = 0;
     int newTotal = 0;
     Scanner in = new Scanner (System.in);
     while (!full){
    	 System.out.print("Custoemr entering : ");
    	 int enter = in.nextInt();
    	 System.out.print("Custoemr leaving : ");
    	 int leave = in.nextInt();
    	  newTotal = totalCustomer + (enter - leave);
    	 if (0 <= newTotal && newTotal <= MAX_CUSTOMER){
    		 totalCustomer = newTotal;
    		 if (totalCustomer == MAX_CUSTOMER);
    		 {
    		 full = true;
    	  
    	 }
     }
        System.out.println("Customer in bar: " +totalCustomer);
        System.out.print("Custoemr entering : ");
   	     enter = in.nextInt();
   	  totalCustomer =  newTotal+enter;
   	 System.out.print("Custoemr leaving : ");
   	       leave = in.nextInt();
   	    totalCustomer = newTotal - leave;
	}
	   System.out.println("Bar is full");
	   System.out.print("Custoemr leaving : ");
	      int leave = in.nextInt();
		    totalCustomer = newTotal - leave;
	      System.out.println("Customer in bar: " +totalCustomer);
	      
	}

}
