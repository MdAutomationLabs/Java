package InterfacesAndPolymorphism;

public class rectangle implements measurements {
	// data field
	private double length;
	private double width;

	/**
	 * default constructor
	 * 
	 */
	public rectangle() {

	}

	/**
	 * rectangle constructor
	 * 
	 * @param length
	 * @param width
	 */
	public rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/*
	 * (non-Javadoc) format output
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "rectangle [length=" + length + ", width=" + width + "]";
	}

	public double perimeter() {
		// TODO Auto-generated method stub

		return 2 * (length + width);
	}

	public double area() {
		return length * width;
		// TODO Auto-generated method stub

	}

}
