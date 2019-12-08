import java.util.Scanner;


public class CompareNumbersAhmed {

	public static void main(String[] args) {
		// Md Ahmed
      double number1 = 5.0;
      double number2 = 6.0;
      Scanner cat = new Scanner (System.in); 
		System.out.print("Please enter a number: "); 
        number1 = cat.nextDouble();  
        System.out.print("Please enter another number: "); 
        number2 = cat.nextDouble();
        System.out.print(number1+ " is equal to " +number2+ " : "); 
        System.out.println( number1 == number2);
        System.out.print(number1+ " is greater than " +number2+ " : "); 
        System.out.println( number1 > number2);
        System.out.print(number1+ " is less than " +number2+ " : "); 
        System.out.println( number1 < number2);
	}
}
