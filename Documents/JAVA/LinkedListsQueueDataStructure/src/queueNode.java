public class queueNode {

	private String data; // data type
	queueNode next; // to increment next
	queueNode previous; // to go back to previous

	/** default constructor
	 */
	public queueNode() {
	}

	/**  constructor
	 * @param data
	 * @param next
	 */
	public queueNode(String data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	/** to get data 
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**  to set data
	 * @param data
	 *            the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/*
	 * (non-Javadoc) format output
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "queueNode [" + data + "]";
	}
}