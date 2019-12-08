import java.util.Scanner;


public class EFScaleAhmed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cen = new Scanner (System.in); // scanner object
		System.out.print("Please enter a value 3sce wind guests in mph: ");
		 if (cen.hasNextInt()) {
			 int windGusts = cen.nextInt();
			 
		if (windGusts <65){
			 System.out.println("Error: thte wind gust must be >65");
		 }
		 else if (windGusts <= 85){
			 System.out.println("EF rating is 0.");
		 }
		 else if (windGusts <= 110){
			 System.out.println("EF rating is 1.");
		 }
		 else if (windGusts <= 135){
			 System.out.println("EF rating is 2.");
		 }
		 else if (windGusts <= 165){
			 System.out.println("EF rating is 3.");
		 }
		 else if (windGusts <= 200){
			 System.out.println("EF rating is 4.");
		 }
		 else {
			 System.out.println("EF rating is 5");
			 cen.close();
		 }
	}
		 else {
			 System.out.println("Error: input must be an integer.");
		 }
	}
}
