package Final_Project;



public class node {
	private String id; // data type
	private String firstName; // data type
	private String lastName;// data type
	 // data type

     
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param position
	 * @param salary
	 * @param startDate
	 * @param address
	 * @param city
	 * @param zip
	 */
	public node(String id, String firstName, String lastName ) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public node(){
		id = "";
		firstName = "";
		lastName = "";
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		return id + "\t" + firstName + "\t"+ lastName ;
	}

}
