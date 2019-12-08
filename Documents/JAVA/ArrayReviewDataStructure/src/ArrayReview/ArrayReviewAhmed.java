package ArrayReview;

import java.util.Random;
import java.util.Scanner;

public class ArrayReviewAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		final int SIZE = 10; // array size
		int num[] = new int[SIZE]; // assigned array
		Random randomNum = new Random(); // assigned random number or created
											// random object

		Scanner in = new Scanner(System.in); // Scanner object to use scanner
												// class

		for (int i = 0; i < num.length; i++) {
			int x = 1 + (int) (Math.random() * 25); // using power math to
													// generate random number
													// between 1 and 25
			num[i] = x;

		}
		System.out.print("Loop number 1 to populate array: ");
		// Looping to generate random number
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.print("Loop number 2 to populate array: ");
		// enhanced for loop to generate the random number
		for (int element : num) {
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println("Loop number 3 to populate array: ");
		// Here two loop to generate specific index number belongs to random
		// number
		for (int i = 0; i < num.length; i++) {
			int x = 1 + (int) (Math.random() * 25);
			num[i] = x;
			System.out
					.println("ArrayName element at index[" + i + "] = " + (x));
		}
	}
}
