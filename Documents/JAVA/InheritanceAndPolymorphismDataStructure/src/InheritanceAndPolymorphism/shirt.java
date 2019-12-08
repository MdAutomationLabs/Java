package InheritanceAndPolymorphism;

public class shirt extends clothing {

	private String style;

	/**
	 * Default constructor
	 * 
	 */
	public shirt() {
		super();
	}

	/**
	 * Class constructor to create an instance of object
	 * 
	 * @param style
	 */
	public shirt(String style) {
		super();
		this.style = style;
	}

	/**
	 * Constructor to create an instance of object including parent class data
	 * fields
	 * 
	 * @param style
	 */
	public shirt(String style, String size, String color) {
		super(size, color);
		this.style = style;

	}

	/**
	 * To get the style from its data field
	 * 
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * To set the user input to its data field
	 * 
	 * @param style
	 *            the style to set
	 * 
	 *            public void setStyle(String style) { this.style = style; }
	 * 
	 * 
	 *            /* (non-Javadoc) formating output in desired way
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return " shirt [style=" + style + ", size= " + super.getSize()
				+ ", color= " + super.getColor() + "]";
	}

}
