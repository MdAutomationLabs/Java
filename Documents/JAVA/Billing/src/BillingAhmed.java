import java.util.Scanner;

public class BillingAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		System.out.printf("Total cost: $%.2f\n", computePhotoBill(0.0));
		System.out.printf("Total cost: $%.2f\n", computePhotoBill(0.0, 0));
		System.out.printf("Total cost: $%.2f\n", computePhotoBill(0.0, 0, 0.0));
	}

	/**
	 * Evaluate photo book price with tax.
	 * 
	 * @param price
	 *            is book value
	 * @return total price
	 */
	public static double computePhotoBill(double price) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your photo book price: ");
		price = in.nextDouble();
		double totalPrice = price + price * .08;
		return totalPrice;
	}

	/**
	 * Evaluate photo book price with quantity and tax.
	 * 
	 * @param price
	 *            is book value
	 * @param quantity
	 *            number of books
	 * @return total price
	 */
	public static double computePhotoBill(double price, int quantity) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your photo book price: ");
		price = in.nextDouble();
		System.out.print("Please enter your photo book quantity: ");
		quantity = in.nextInt();
		double totalPrice = (price * quantity) + (price * quantity) * .08;
		return totalPrice;

	}

	/**
	 * Evaluate photo book price with quantity,coupon and tax.
	 * 
	 * @param price
	 *            is book value
	 * @param quantity
	 *            number of books
	 * @param coupon
	 *            is discount rate
	 * @return total price
	 */
	public static double computePhotoBill(double price, int quantity,
			double coupon) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your photo book price: ");
		price = in.nextDouble();
		System.out.print("Please enter your photo book quantity: ");
		quantity = in.nextInt();
		System.out.print("Please enter your photo book coupon: ");
		coupon = in.nextDouble();
		double totalPrice = (price * quantity) + (price * quantity) * .08
				- ((price * quantity) + (price * quantity) * .08) * coupon;
		return totalPrice;

	}

}
