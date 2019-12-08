package BasicOOandEncapsulation;

public class canTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		// These are the object created to describe its company, content and
		// values
		can SWPeaches = new can("S&W", "Peaches", 12.0, 2.39);
		can GreengaintGreenBeans = new can("green Gaint", "Green Beans");
		can DelMonteCreamedCorn = new can("Del Monte", "Creamed Corn", 13.4,
				2.49);

		// Here I just set some value to the specific data fields to previously
		// created object
		GreengaintGreenBeans.setSize(11.9);
		GreengaintGreenBeans.setPrice(1.79);

		// Here I just printing the object values by calling in there object
		// name
		System.out.println("Can 1: " + SWPeaches.toString());
		System.out.println("Can 1: " + GreengaintGreenBeans.toString());
		System.out.println("Can 1: " + DelMonteCreamedCorn.toString());
	}

}
