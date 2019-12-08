public class LinkedListQueueTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		queueList queue = new queueList(); // create an object of queue list
		queue.enqueue("dog");
		queue.enqueue("cat");
		queue.enqueue("mouse");
		queue.enqueue("pig");
		queue.enqueue("bird");
		System.out.println("All elements");
		queue.print();
		System.out.println("size: " + queue.size());
		System.out.println("isFull: " + queue.isFull());
		queue.enqueue("puppy"); // tried to enter new elements but its full
		System.out.println("size: " + queue.size());
		System.out.println("dequeue: " + queue.dequeue()); // front element out
		System.out.println("size: " + queue.size());
		System.out.println("puppy is entered......");
		queue.enqueue("puppy"); // puppy is taken to end since I dequeued front dog 
		System.out.println("size: " + queue.size());
		System.out.println("Front: " + queue.peek());
		System.out.println("dequeue: " + queue.dequeue());
		System.out.println("size: " + queue.size());
		System.out.println("Front: " + queue.peek());
		System.out.println("dequeue: " + queue.dequeue());
		System.out.println("dequeue: " + queue.dequeue());
		System.out.println("dequeue: " + queue.dequeue());
		System.out.println("dequeue: " + queue.dequeue());
		System.out.println("dequeue: " + queue.dequeue());
		System.out.println("size: " + queue.size());
		System.out.println("isFull: " + queue.isFull());
		System.out.println("isEmpty: " + queue.isEmpty());
	}
}