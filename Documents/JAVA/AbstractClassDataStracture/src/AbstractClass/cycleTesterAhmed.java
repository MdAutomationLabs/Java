package AbstractClass;

public class cycleTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		
		// two bicycle object is created
		cycle lulu = new bicycle(10, 20, 10);
		cycle jojo = new bicycle(5, 7, 5);

		System.out.println("lulu " + lulu.toString());
		System.out.println("jojo " + jojo.toString());

		// methods are called to operate the definition or implementation
		lulu.ride();
		lulu.brake(0);
		lulu.ride();
		lulu.ride();
		jojo.brake(0);

		System.out.println("lulu " + lulu.toString());
		System.out.println("jojo " + jojo.toString());

	}

}
