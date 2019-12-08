package LinkedListsStack;

public class stackList {
    stackNode top; // top node to track the input output 
      int size;  // to limit the size of stack node
	
	public void push(String cloth) { // push method to add element 
		stackNode newNode = new stackNode(cloth); // each time creating a new node
		try { 
			if(!isFull()){
			if(top == null){
				top = newNode;
				size++;
			}else{
				newNode.next=top;
				top=newNode;
				size++;
			}
			}
		} catch (ArrayIndexOutOfBoundsException d) { // exception handler 
			System.out.println("You tried to push, Sorry its full");
                      size--;	// drop out the extra node then its size
		}
	}

	public stackNode pop() { // pop method to remove the element 
		stackNode  removeNode = null; // node are set to null 
		try {
			if(size!=0){ 
			if(top == null)  // if no element exist then execute this
				System.out.println("Queue is empty");
			else{
				removeNode = top;
				top = top.next;
				removeNode.next=null;
			}
			}
			size--;
		} catch (ArrayIndexOutOfBoundsException d) { // exception handler 
			System.out.println("out of size");
		}
		return removeNode;
	}
	
	public boolean isFull() {
		return (size == 5);
	}
	
	public boolean isEmpty(){ // empty method
		return (top == null);
	}

	public int size(){  // size checking method
		return size;
}
	
	public void print() { // to print all element in the stack
		stackNode add = top;
		if(add.getData() == null)
			System.out.println("Queue is empty");
			else 
				while (add.next != null){
					System.out.println("Items: "+add.getData());
					add = add.next;
				}
		System.out.println("Items: "+add.getData());
		System.out.println("");
		}

	public String top() { // to get the top element
		String front = null;
		if(!isEmpty())
			front = top.getData();
		return front;
	}
	}


