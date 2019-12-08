package Queue;

public class queueTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		queue animals = new queue(); // queue object is created
		// enqueued elements
		animals.enqueue("dog");
		animals.enqueue("cat");
		animals.enqueue("mouse");
		animals.enqueue("pig");
		animals.enqueue("bird");
		System.out.println("All elements");
		animals.print();
		System.out.println("size: " + animals.size());
		System.out.println("isFull: " + animals.isFull());

		animals.enqueue("puppy"); // tried to enter new elements but its full

		System.out.println("size: " + animals.size());

		System.out.println("dequeue: " + animals.dequeue());

		System.out.println("puppy is entered......");

		animals.enqueue("puppy"); // puppy will be taken since I dequeued
									// dog/front
		System.out.println("size: " + animals.size());
		System.out.println("tail element: " + animals.tail());
		System.out.println("dequeue: " + animals.dequeue());
		System.out.println("size: " + animals.size());
		System.out.println("dequeue: " + animals.dequeue());
		System.out.println("front element: " + animals.peek());
		System.out.println("dequeue: " + animals.dequeue());
		System.out.println("dequeue: " + animals.dequeue());
		System.out.println("dequeue: " + animals.dequeue());
		System.out.println("size: " + animals.size());
		System.out.println("isFull: " + animals.isFull());
		System.out.println("isEmpty: " + animals.isEmpty());

	}
	
}
