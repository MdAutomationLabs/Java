package LinkedListsStack;

public class stackNode {
	private String data; // data type
	stackNode next; // node incremental

	/**
	 * Default Constructor
	 */
	public stackNode() {
	}

	/**
	 * Constructor
	 * @param data
	 * @param next
	 */
	public stackNode(String data) {
		this.data = data;
		this.next = null;
	}

	/**
	 * to set the data
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * to get the data
	 * @param data
	 *            the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/*
	 * toString to format the output (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "stackNode [" + data + "]";
	}
}
