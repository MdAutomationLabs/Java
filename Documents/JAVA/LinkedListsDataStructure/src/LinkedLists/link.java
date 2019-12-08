package LinkedLists;

public class link {
	private can callCan; // calling can class
	link next;

	/**
	 * @param can
	 */
	public link(can can) { // Constructor 
		this.callCan = can;
	}
	public void print() {
		System.out.println("{ " + callCan.toString() + "}");
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.()
	 */
	@Override
	public String toString() {
		return callCan.toString();
	}

}
