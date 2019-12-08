package StackAssignment;

public class stack {

	private String stack[] = new String[5]; // stack array and the size is
											// initialized
	private int top = -1; // index set to -1 so that we can start our stack
							// index to 0

	/**
	 * default constructor
	 * 
	 * 
	 */
	public stack() {
	}
	
	public stack(String[] stack) {

		this.stack = stack;
		
	}

	/**
	 * stack constructor
	 * 
	 * @param stack
	 * @param top
	 */
	public stack(String[] stack, int top) {

		this.stack = stack;
		this.top = top;
	}
	


	public void push(String cloth) { // here we push the element to the stack
		try {
			top++;
			stack[top] = cloth;
		} catch (ArrayIndexOutOfBoundsException d) {
			top--;
			System.out.println("You tried to push, Sorry its full");
		}

	}

	public String pop() { // here we pop the element to the stack
		String cloth = stack[top];
		try {

			stack[top] = "0";
			top--;
		} catch (ArrayIndexOutOfBoundsException d) {
			top++;
		}
		return cloth;
	}

	public boolean isEmpty() { // to check whether the stack empty or any
								// element exist
		return (top == -1);
	}

	public int size() { // to get the element element size
		return top + 1;
	}

	public void print() { // to print all element in the stack
		for (String n : stack) {
			System.out.println(n + "-element");
		}
	}

	public String top() { // to get the top element
		return stack[top];
	}

	

}
