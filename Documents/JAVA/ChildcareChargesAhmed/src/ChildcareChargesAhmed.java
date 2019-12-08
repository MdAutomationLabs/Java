import java.util.Scanner;

public class ChildcareChargesAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		final int SENTINEL = 999;
		int age = 0;
		Scanner in = new Scanner(System.in);
		int rates[][] = { { 30, 60, 88, 115, 140 }, { 26, 52, 70, 96, 120 },
				{ 24, 46, 76, 89, 110 }, { 22, 40, 60, 75, 88 },
				{ 20, 35, 50, 66, 84 } };

		while (age != SENTINEL) {
			System.out.print("Please enter child age 0-4 or 999 to quit: ");
			age = in.nextInt();
			if (age == SENTINEL)
				continue;
			while (age < 0 || age > 4) {
				System.out.print("Please enter child age 0-4: ");
				age = in.nextInt();
			}
			System.out.print("Please enter days for childcare needed, 1-5: ");
			int days = in.nextInt();
			while (days < 1 || days > 5) {
				System.out
						.println("Please enter days for childcare needed, 1-5: ");
				days = in.nextInt();
			}
			System.out.println("Your total cost is: " + "$"
					+ rates[age][days - 1] + "\n for " + days + " days.");
		}
	}
}
