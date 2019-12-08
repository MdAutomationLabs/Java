package StackAssignment;

public class stackTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		stack shirts = new stack(); // shirts object is created

		shirts.push("redShirt"); // five element are pushed to stack
		shirts.push("greenShirt");
		shirts.push("yellowPant");
		shirts.push("purpleSock");
		shirts.push("pinkSock");
		System.out.println("size: " + shirts.size()); // stack size method is
														// call to see the total
														// size of element
		shirts.push("blueShirt"); // here we pushed new element to stack

		System.out.println("size: " + shirts.size());// stack size method is
														// call
														// to see the total any
														// changes in size of
														// element

		System.out.println("pop: " + shirts.pop()); // elements are taken out
		System.out.println("pop: " + shirts.pop());

		System.out.println("size: " + shirts.size());

		System.out.println("pop: " + shirts.pop());
		System.out.println("top element: " + shirts.top()); // top element of
															// the
															// stack
		System.out.println("pop: " + shirts.pop()); // elements are taken out
		System.out.println("pop: " + shirts.pop());
		System.out.println("size: " + shirts.size());
		System.out.println("empty: " + shirts.isEmpty()); // to check is the
															// stack empty

		System.out.println("Print all indexes");
		shirts.print(); // print all elements

	}

}
