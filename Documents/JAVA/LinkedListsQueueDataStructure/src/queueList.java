
public class queueList {
	
	 queueNode front, rear; // front and rear tracker for queue
		int size;
		
		public void enqueue(String item) {  // enqueue the queue
			queueNode newNode = new queueNode(item); 
			try {
				if(!isFull())
				if (front == null) { // checking whether any element in first created exist .
					front = rear = newNode; 						
                   size++;
					} else {
						rear.next = newNode;
						newNode.previous = rear;
						rear = newNode;
						size++;
					}
			} catch (ArrayIndexOutOfBoundsException d) {  // exception handler
                      size--; // resize excess input
                      System.out.println("You tried to enqueue, Sorry its full");
			}
		}

		public queueNode dequeue() {  // take out the 
			queueNode  removeNode = null; // an empty node is created
			try {
				if(size!=0){
				if(front == null)
					System.out.println("Queue is empty");
			      	
				else if (front == rear){
					removeNode = front;
					front = rear = null;
				}else{
					removeNode = front;
					front = front.next;
					front.previous = null;
				}
				size--;
			}
			} catch (ArrayIndexOutOfBoundsException d) {  // stop to dequeue element more than its size
				System.out.println("out of size");
			}
			return removeNode;
		}

		public boolean isEmpty() {  // empty method
			return (front == null);
		}

		public boolean isFull() {
			return (size == 5);
		}

		public int size() { // to get the element in size
			return size;
		}

		public void print() { // to print the data of the element
			queueNode add = front; // a node initialized to front 
			if(add == null) // check is there any node 
				System.out.println("Queue is empty");
				else 
					while (add != null){ // if any node exist 
						System.out.println("item: "+add.getData()); // get the data 
						add = add.next; // get next
					}
			System.out.println("");
			}
		public queueNode peek() {
			return front;
		}
}
