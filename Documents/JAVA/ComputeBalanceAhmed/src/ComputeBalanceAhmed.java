import java.util.Scanner;

public class ComputeBalanceAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		System.out.printf("Total balance $%.2f\n", balance(0.0, 0.0, 0.0));
	}

	/**
	 * computes the investment growth after certain year.
	 * 
	 * @param principal
	 *            the initial value of investment
	 * @param rate
	 *            is the percentage of growth in every year
	 * @param years
	 *            cycle add a year after year is passed
	 * @return amount
	 */
	public static double balance(double principal, double rate, double years) {
		double amount = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the initial investment amount: ");
		principal = in.nextDouble();

		System.out.print("Enter the interest rate: ");
		rate = in.nextDouble();

		System.out.print("Enter the number of years: ");
		years = in.nextDouble();

		for (int i = 1; i < years; i++) {
			amount = principal * Math.pow(1.0 + rate, years);
			amount += principal;
		}
		return amount - principal;
	}
}
