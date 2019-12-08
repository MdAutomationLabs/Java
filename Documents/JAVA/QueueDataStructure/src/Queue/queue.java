package Queue;

public class queue {
	// data fields
	private String queue[] = new String[5]; // initialized queue
	private int size = 0;
	private int front = 0;
	private int tail = 0;
	private int max = 4;

	/**
	 * default constructor
	 * 
	 * 
	 */
	public queue() {

	}

	/**
	 * queue constructor
	 * 
	 * @param queue
	 * @param size
	 * @param front
	 * @param tail
	 */

	public queue(String[] queue, int size, int front, int tail) {

		this.queue = queue;
		this.size = size;
		this.front = front;
		this.tail = tail;
	}

	// enqueue the queue
	public void enqueue(String data) {
		try {
			if (queue[tail] == null) { // checking whether null exist in any
										// element.

				queue[tail] = data; // add data to the tail of queue
				if (tail < max) { // check the availability of length of queue
									// if yes
					tail++; // keep adding data to the tail
				} else {
					tail = 0; // if no get start at 0 index to add next elements
				}

				size++; // add the elements to the queue size
			} else {
				System.out
						.println("its full now, Please dequeue elements to enter new elements");
			}

		} catch (ArrayIndexOutOfBoundsException d) { // handle exception
			tail--;
		}

	}

	public String dequeue() {
		String a = "";
		try {
			a = queue[front];

			queue[front] = null;
			if (front < max) { // max number of items is declared to 4 items
								// because I
								// add elements after checking condition so that
								// its
								// going to equal to my queue size
				front++;
			} else {
				front = 0; // once tail exit 5 times its move to the front index
							// to reserve the next elements
			}
			if (size > 0) {
				size--;
			}
		} catch (ArrayIndexOutOfBoundsException d) {
			System.out.println("out of size");
		}
		return a;
	}

	public boolean isEmpty() {

		return (size == 0);
	}

	public boolean isFull() {
		return (size == 5);
	}

	public int size() { // to get the element in size
		return size;
	}

	public void print() { // to print the
		for (int i = 0; i < 5; i++) {
			System.out.println(queue[i]);
		}
	}

	public String peek() {

		return queue[front];

	}

	// Here I tried to separate the next tail to the
	// present element as tail if I don't do this its
	// just point/get the front index as tail in this case I
	// think tail should be the element exist in present
	
	public String tail() {
		String last = "";
		if (tail == 0) {
			last = queue[max];
		} else {
			last = queue[tail - 1];
		}
		return last;

	}
}
