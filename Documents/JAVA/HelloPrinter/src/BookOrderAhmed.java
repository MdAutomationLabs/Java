import java.util.Scanner;


public class BookOrderAhmed {

	public static void main(String[] args) {
		// md ahmed
		
		int numberOfBook = 0;
		final double TAX = 1.065;
		final double SHIPPING_COST = 2.95;
        
        Scanner in = new Scanner (System.in); // user input
        System.out.print("Please Enter the book price: ");
         double price = in.nextDouble();
        System.out.print("Please Enter the number of books: ");
        numberOfBook = in.nextInt();
         double subTotal = ((price * numberOfBook)+ (numberOfBook* SHIPPING_COST))* TAX ; 
        System.out.printf("Price of the order: $%.2f", subTotal);
        in.close();
	}

}
