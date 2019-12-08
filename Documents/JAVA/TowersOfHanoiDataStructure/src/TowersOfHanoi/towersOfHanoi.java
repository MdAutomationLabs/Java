package TowersOfHanoi;

public class towersOfHanoi {
	// private data types
	private int number;
	private String start;
	private String auxiliary;
	private String end;

	/**
	 * towersOfHanoi default constructor
	 */
	public towersOfHanoi() {

	}

	/**
	 * towersOfHanoi constructor
	 * 
	 * @param number
	 * @param start
	 * @param auxiliary
	 * @param end
	 */
	public towersOfHanoi(int number, String start, String auxiliary, String end) {
		super();
		this.number = number;
		this.start = start;
		this.auxiliary = auxiliary;
		this.end = end;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}

	/**
	 * @param start
	 *            the start to set
	 */
	public void setStart(String start) {
		this.start = start;
	}

	/**
	 * @return the auxiliary
	 */
	public String getAuxiliary() {
		return auxiliary;
	}

	/**
	 * @param auxiliary
	 *            the auxiliary to set
	 */
	public void setAuxiliary(String auxiliary) {
		this.auxiliary = auxiliary;
	}

	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * @param end
	 *            the end to set
	 */
	public void setEnd(String end) {
		this.end = end;
	}

	// tower method
	public void tower(int num, String start, String auxiliary, String end) {
		if (num == 1) { // If the number of discs is one then if statement will
						// be true
			System.out.println(start + " -- " + end); // disc will move to end
		} else {
			// if disc more then one it will moved by one each time
			tower(num - 1, start, end, auxiliary);
			System.out.println(start + " -- " + end);
			tower(num - 1, auxiliary, start, end);
		}
	}

	/*
	 * (non-Javadoc) formating the output
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "towersOfHanoi [number=" + number + ", start=" + start
				+ ", auxiliary=" + auxiliary + ", end=" + end + "]";
	}

}
