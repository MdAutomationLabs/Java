package InterfacesAndPolymorphism;

public class square implements measurements {
	// data field
	private double side;

	/**
	 * default constructor
	 * 
	 */
	public square() {
		side = 0;
	}

	/**
	 * class constructor
	 * 
	 * @param side
	 */
	public square(double side) {

		this.side = side;
	}

	/**
	 * to get the square side
	 * 
	 * @return the side
	 */
	public double getSide() {

		return side;
	}

	/**
	 * to set the square side
	 * 
	 * @param side
	 *            the side to set
	 */
	public void setSide(double side) {

		this.side = side;
	}

	/*
	 * (non-Javadoc) format output
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "square [side=" + side + "]";
	}

	// defined interface methods
	public double perimeter() {
		// TODO Auto-generated method stub
		return side * 4;
	}

	public double area() {
		return Math.pow(side, 2);
		// TODO Auto-generated method stub

	}
}
