import java.util.Scanner;


public class CompareNamesAhmed {
	public static void main (String[]args){
		// Md Ahmed
		Scanner pen = new Scanner (System.in); 
		System.out.print("Please enter your first name: ");
		String name1 = pen.next();
		name1 = name1.toUpperCase();
		System.out.print("Please enter your first name: ");
		String name2 = pen.next();
		name2 = name2.toUpperCase();
		if (name1.equals(name2))// decision making
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
		pen.close();
		
		

}
}