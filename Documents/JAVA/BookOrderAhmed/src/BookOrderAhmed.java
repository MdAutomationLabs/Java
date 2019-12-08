import java.util.Scanner;


public class BookOrderAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		int numberOfBook = 0;
		double numberOfCost = 0;
		final double TAX = .065;
		final double SHIPPING_COST = 2.95;
		double subTotal =0.0;
		double taxAmount = 0.0;
		double shipping = 0.0;
        double orderTotal = 0.0;
        Scanner in = new Scanner (System.in); // create an object
        System.out.print("Please Enter the number of books purchased: ");
        if (in.hasNextInt()) {
			 numberOfBook = in.nextInt();
        for (int counter =1; counter <= numberOfBook; counter++)
        {
        	System.out.print("Enter the book price_"+counter+ ": ");
        	numberOfCost = in.nextDouble();
        	subTotal += numberOfCost;
        } 
        System.out.printf("Subtotal: $%.2f ",subTotal);
        System.out.println();
        taxAmount = subTotal * TAX;
        System.out.printf("Tax: $%.2f ",taxAmount);
        System.out.println();
        
        shipping = numberOfBook * SHIPPING_COST;
        System.out.printf("Shipping: $%.2f ",shipping);
        System.out.println();
        System.out.println("------------------");
        
        orderTotal = subTotal + taxAmount + shipping ;
        System.out.printf("Order total: $%.2f ",orderTotal);
        in.close();
	}

}
}
