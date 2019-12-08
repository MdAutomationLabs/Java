import java.io.PrintStream;
import java.util.Scanner;


public class MadLibsAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		String name = "Kelli";
		String object = "flower";
		String object1 = "calendar";
		String object2 = "picture";
		String verb = "ran";
		String adjective = "silky";
		Scanner ted = new Scanner (System.in);
		System.out.print("Please enter a name: " );
		 name = ted.next();
		 System.out.print("Please enter an object: " );
		 object = ted.next();
		 System.out.print("Please enter an object: " );
		 object1 = ted.next();
		 System.out.print("Please enter an object: ");
		 object2 = ted.next();
		 System.out.print("Please enter a past tense verb: " );
		 verb = ted.next();
		 System.out.print("Please enter an adjective: " );
		 adjective = ted.next();
		 //String output = name.substring(0,1).toUpperCase();
		   //String output = name.toUpperCase();
		 System.out.print(name.toUpperCase());
		 System.out.println(" had a little "  +object+  " Its "  +object1+ 
				  " was " +adjective+ " as snow And everywhere that " +name+ " " +verb+ 
				 " The " +object2+ " was sure to go.");
		 ted.close();
		 
	}

}
