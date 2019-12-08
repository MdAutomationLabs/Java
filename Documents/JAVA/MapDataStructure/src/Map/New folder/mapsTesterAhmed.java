package Map;

import java.util.HashMap;
import java.util.Map;

public class mapsTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		// An object created for map class
		mapsEntry Pepole = new mapsEntry();
		// email and name are entered to the array
		System.out.println("Inserted keys and data:");
		Pepole.input("egrs@rgsr.com ", "Micheal");
		Pepole.input("sdfger@bvx.org ", "Dena");
		Pepole.input("vcodf@retb.uk ", "Michelle");
		Pepole.input("vcodf@tetb.edu ", "Alex");
		Pepole.print(); // printing all the inputs
		System.out.println();
		System.out.println("Searching keys for values: ");
		Pepole.serch("egrs@rgsr.com ");
		Pepole.serch("vcodf@tetb.edu ");
		System.out.println();
		System.out.println("Removed keys and data: ");
		Pepole.remove("vcodf@tetb.edu ");
		Pepole.remove("vcodf@retb.uk ");
	

	}

}
