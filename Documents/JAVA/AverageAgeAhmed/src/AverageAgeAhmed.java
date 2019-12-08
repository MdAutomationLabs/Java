import java.util.Scanner;


public class AverageAgeAhmed {
    
	public static void main(String[] args) {
		// Md Ahmed
		     int age = 0;
		     int totalAge = 0;
		     int countAge = 0;
		    System.out.println("This program will calculate the average age.");
		    System.out.println("When you are finished adding ages, type '999'.");
		    System.out.print("Enter an age for a person : ");
		    Scanner beg = new Scanner (System.in); // create an scanner called beg
		     while (age != 999){
		    	 age = beg.nextInt();
		    	if (age != 999) {
		    	 totalAge +=  age;
		    	 countAge++;
		    	 System.out.print("Enter an age for a person : ");}
		     } if (countAge > 0) {
		    	double average = (double) totalAge / countAge ;
		    	 System.out.printf("The average age is  "+average);
		    	// System.out.println("Age count "+countAge); 
		    	 }
		     else {
		    	 System.out.println("No data.");
		    	 beg.close();
		     }
		     
}
}
