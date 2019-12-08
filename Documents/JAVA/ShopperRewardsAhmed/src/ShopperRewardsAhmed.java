import java.util.Scanner;


public class ShopperRewardsAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		Scanner cen = new Scanner (System.in); // scanner object
		// groceries range for discount
		 final double LOW_GROCERY_PURCHASE_RANGE = 10.0;
		 final double  LESS_LOW_GROCERY_PURCHASE_RANGE = 60.0;
		 final double  MID_GROCERY_PURCHASE_RANGE = 150.0;
		 final double  MAX_GROCERY_PURCHASE_RANGE = 210.0;
		 //gas rewards range
		 final double GAS_MIN_RANGE = 1.0;
		 final double GAS_MAX_RANGE_1 = 49.0;
		 final double GAS_MAX_RANGE_2 = 99.0;
		 // variables to hold values
		 int couponPercent = 0;
		  double discountRange = 0.0 ;
		
		 System.out.print("Please enter the cost of your groceries: ");
		double groceries = cen.nextDouble();
		
		if (groceries < LOW_GROCERY_PURCHASE_RANGE){
			couponPercent =0 ;
		}
		else if  (groceries <= LESS_LOW_GROCERY_PURCHASE_RANGE){
			couponPercent =8 ;
		}
		else if  (groceries <= MID_GROCERY_PURCHASE_RANGE){
			couponPercent =10 ;
		}
		else if  (groceries <= MAX_GROCERY_PURCHASE_RANGE){
			couponPercent =12 ;
		}
		else   {
			couponPercent =14 ;
		}
		if (GAS_MIN_RANGE >= groceries && groceries <= GAS_MAX_RANGE_1){
			discountRange = .01;
		}
		else if (GAS_MAX_RANGE_1 >= groceries && groceries <= GAS_MAX_RANGE_2){
			discountRange = .02;
		}
		else {
			discountRange = .03;
		}
		//calculation variable
		double discountPercent = 0.0;
		discountPercent = (groceries *couponPercent/100);
		
		System.out.printf("You receive a discount coupon of: $%.2f",discountPercent);
		 System.out.print(("("+ couponPercent + "% of your purchase.)\n"));
		 System.out.println("You have earned a  " +discountRange+ "per gallon of gas.");
		
		 cen.close();
		 
	}
}
