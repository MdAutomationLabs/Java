import java.lang.StringIndexOutOfBoundsException;
import java.util.Scanner;

public class MemberIDAhmed {

	public static void main(String[] args) {
		String id = "fjh";
		Scanner in = new Scanner (System.in);// scanner object
		System.out.print("Input: ");
		if (in.hasNext())
		{
			id = in.next();
			if (id.length() == 14) {
				String itt = id.toUpperCase();
				
				/*//to format string in substring 
				    String fchar = id.substring(0,1).toUpperCase();
			        String fgroup = id.substring(1,5).toUpperCase();
			        String sgroup = id.substring(5,9).toUpperCase();
			        String tgroup = id.substring(9,13).toUpperCase();
			        String dgroup = id.substring(13,14).toUpperCase();
			        
			        System.out.println("Display: " +fchar+ "-" + fgroup+ " " + sgroup+ " " + tgroup+ "-" 
			                                        +dgroup);*/
				System.out.println("Display: "+itt);
			}else{
			System.out.println("Wrong input it must be 14 character");
			in.close();
		}
		}
	}
}
		        
	
			
     
