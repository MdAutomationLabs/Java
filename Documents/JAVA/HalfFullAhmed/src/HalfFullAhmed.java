import java.util.Scanner;


public class HalfFullAhmed {

	public static void main(String[] args) {
		// Md Ahmed
	
		Scanner in= new Scanner(System.in);
		//String ("px 0.0px 0.0px 0.0px");
		//String one = ("front: 11.0px monaco} p.p2 {margin: 0.0px 0.0px 0.0px");
		//String two = "font: 11.0px monaco; color: #931a68} span.s1 {color: #931a68} span.s2 {color: #7e504f} span.s3 {color: #000000} span.s4 {color: #0326cc} span.Apple-tab-span {white-space:pre} -->";
		//String units = "feet";
		int inches = 0;
		int measurement = 3;
		String units = in.nextstring();

		switch (units) {
		  case "inches":
		      inches = measurement;
		      break;
		  case "feet":
		      inches = measurement * 12;
		      break;
		  case "yards":
		      inches = measurement * 36;
		      break;    
		  case "miles":
		      inches = measurement * 12 * 5280;
		      break;
		  default:       System.out.println("Illegal unit of measure.");

		}
		System.out.println(inches);
	}

	}
	
