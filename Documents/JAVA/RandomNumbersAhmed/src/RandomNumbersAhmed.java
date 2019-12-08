import java.util.Random;
import java.util.Scanner;


public class RandomNumbersAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		int number = 0;
		int max = 0;
		int min = 0;
		//Random rand = new  Random ();
				//number = rand.nextInt(max)+min;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("How many random numbers do you want to see: ");
		number = input.nextInt();
		
		System.out.print("Smallest number: ");
		min = input.nextInt();
		
		System.out.print("Largest number: ");
		max= input.nextInt();
		 
		for (int i= 1; i < number;i++){
			int random = (int) (Math.random() * max +1);
			System.out.println(random);
		}
	}
}

	


