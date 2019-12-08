import java.util.Scanner;


public class SilyCaseAhmed {

	public static void main(String[] args) {
		// Md ahmed
		 String newString = ""; 
		 Scanner in = new Scanner(System. in ); 
		 System. out .print("Please enter a phrase "); 
		 String userInput = in.nextLine(); 
		 for (int i = 0; i < userInput.length(); i++)
		 { String tempChar = userInput.substring(i, i + 1); 
			 if (i%2 == 0) 
			 { tempChar = tempChar.toUpperCase();} 
			 else { tempChar = tempChar.toLowerCase();} 
			 newString = newString + tempChar;}
		   System. out .println(newString);
		   in.close(); 

	}

}
