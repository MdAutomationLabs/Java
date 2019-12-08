package InheritanceAndPolymorphism;

public class clothing {
	// Data fields
	private String size;
	private String color;

	/**
	 * Default constructor
	 * 
	 */
	public clothing() {
		
	}

	/**
	 * Class constructor to create object instance
	 * 
	 * @param size
	 * @param color
	 */
	public clothing(String size, String color) {
		this.size = size;
		this.color = color;
	}

	/**
	 * Get method to get the value from its data fields
	 * 
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * To set the value in its data fields
	 * 
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * Get method to get the value from its data fields
	 * 
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * To set the value in its data fields
	 * 
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * (non-Javadoc) Formating the output
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "clothing [size=" + size + ", color=" + color + "]";
	}

}
