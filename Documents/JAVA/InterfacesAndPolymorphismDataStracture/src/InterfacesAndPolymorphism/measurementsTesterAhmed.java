package InterfacesAndPolymorphism;

public class measurementsTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		// object created for square class
		square square1 = new square(5);
		System.out.println(square1);
		System.out.println("Square Perimeter " + square1.perimeter());
		System.out.println("Square Area " + square1.area());
		// set new value to square1 object
		square1.setSide(3);
		System.out.println(square1);
		System.out.println();

		// object created for rectangle class
		rectangle rectangle1 = new rectangle(2, 4);
		System.out.println(rectangle1);
		System.out.println("Rectangle Perimeter " + rectangle1.perimeter());
		System.out.println("Rectangle Area " + rectangle1.area());
		// set new value to rectangle1 object
		rectangle1.setLength(8);
		rectangle1.setWidth(9);
		System.out.println(rectangle1);
	}

}
