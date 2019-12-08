import java.util.Scanner;


public class PrintStarsAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		Scanner in = new Scanner (System.in);
		System.out.print("How many rows of star would you like to print: ");
	      int num = in.nextInt();
		do
			if (num > 0)
			{
			System.out.println("**********");
			num--;
		}else if (num == 0)
		{
			System.out.println("**********");
		}
	    while (num > 0);
	    in.close();
		}
	}

		

		




