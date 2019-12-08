package InheritanceAndPolymorphism;

public class socks extends clothing {
	private boolean pair;

	/**
	 * Default Constructor
	 * 
	 */
	public socks() {
		super();
	}

	/**
	 * Class constructor for object instance
	 * 
	 * @param pair
	 */
	public socks(String size, String color, boolean pair) {
		super(size, color);
		this.pair = pair;
	}

	/**
	 * Inherited class constructor with default class value
	 * 
	 * @param pair
	 */
	public socks(String size, String color) {
		super(size, color);
		this.pair = true;
	}

	/**
	 * To get the pair size from its data field
	 * 
	 * @return the pair
	 */
	public boolean isPair() {
		return pair;
	}

	/**
	 * To set the value to data fields
	 * 
	 * @param pair
	 *            the pair to set
	 */
	public void setPair(boolean pair) {
		this.pair = pair;
	}

	/*
	 * (non-Javadoc) Formating output
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "socks [pair=" + pair + ", size= " + super.getSize()
				+ ", color= " + super.getColor() + "]";
	}

}
