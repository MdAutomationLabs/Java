import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class SimpleArrayAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		Random randomNum = new Random();
		Scanner in = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("#0.00");
		final int SIZE = 15;
		double[] values = new double[SIZE];

		for (int i = 0; i < values.length; i++) {
			double x = 1 + (double) (Math.random() * 15);
			values[i] = x;
			System.out.println("Simple array element at index[" + i + "] = "
					+ formatter.format(x));
		}
	}
}
