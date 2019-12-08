package LinkedListsStack;

public class stackLinkedListTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		stackList stack = new stackList();
		stack.push("redShirt"); // five element are pushed to stack list
		stack.push("greenShirt");
		stack.push("yellowPant");
		stack.push("purpleSock");
		stack.push("pinkSock");
		System.out.println("All elements");
		stack.print();
		System.out.println("size: " + stack.size());
		System.out.println("isFull: " + stack.isFull());
		stack.push("blueShirt"); // tried to enter new elements but its full
		System.out.println("blueShirt tried to enter");
		System.out.println("size: " + stack.size());
		System.out.println("isFull: " + stack.isFull());
		System.out.println("pop: " + stack.pop());
		System.out.println("All elements");
		stack.print();
		System.out.println("size: " + stack.size());
		System.out.println("isFull: " + stack.isFull());
		stack.push("blueShirt");
		System.out.println("blueShirt entered");
		System.out.println("size: " + stack.size());
		System.out.println("top: " + stack.top());
		System.out.println("pop: " + stack.pop());
		System.out.println("top: " + stack.top());
		System.out.println("isEmpty: " + stack.isEmpty());
		System.out.println("size: " + stack.size());

	}

}
