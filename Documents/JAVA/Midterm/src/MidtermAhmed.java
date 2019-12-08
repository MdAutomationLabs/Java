import java.util.Scanner;

public class MidtermAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		final String SENTINEL = "ZZZ";
		String allStar = "y";
		String nonAllStar = "y";
		String fname = "f";
		String star = "";
		double bonus = 0.0;
		String pstar = "*";

		Scanner in = new Scanner(System.in);
		System.out.print("First name: ");
		fname = in.next().toUpperCase();
		do {
			System.out.print("Last name: ");
			String lname = in.next().toUpperCase();
			System.out.print("Enter total sales: ");
			double tsales = in.nextDouble();
			System.out.print("Press y for all-star, n for non-all-star: ");

			if (in.hasNext()) {
				star = in.next();

				if (star.equals(nonAllStar)) {

					bonus = (double) (tsales * .03);
					if (!star.equals(nonAllStar)) {
						System.out.println("****");
					} else {
						System.out.println("*****");
					}
				} else {
					bonus = tsales * .02;
				}
				System.out.printf(fname + "," + lname + "-$%.2f", bonus);
				System.out.println();
				System.out
						.print("Please enter another first name or type ZZZ to quit: ");

				fname = in.next().toUpperCase();
			}
		} while (!fname.equals(SENTINEL));

	}
}
