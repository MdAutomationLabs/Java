import java.util.InputMismatchException;
import java.util.Scanner;

public class BadArrayIndexAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		String names[] = new String[10];
		names[0] = "Mushahid";
		names[1] = "Almir";
		names[2] = "Rehan";
		names[3] = "Alik";
		names[4] = "Frank";
		names[5] = "Alexa";
		names[6] = "Addison";
		names[7] = "Alice";
		names[8] = "Anna";
		names[9] = "Md";
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean again = true;
		while (again) {
			try {
				System.out
						.print("Please enter an integer 0-9 \nto get your desired name: ");
				input = in.nextInt();
				System.out.println("The name is: " + names[input]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Invalid input.");
				System.out
						.print("Please enter an integer 0-9 \nto get your desired name: ");
				in.next();
			} catch (InputMismatchException ex) {
				System.out.println("Invalid input.");
				in.next();
			}

		}
		in.close();
	}
}
