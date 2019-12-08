package Final_Project;
// Md Ahmed
// I could more data But thought that simple could be the good one  
public class node {
	private String id; // data type
	private String firstName; // data type
	private String lastName;// data type
	
	/**  constructor 
	 * @param id
	 * @param firstName
	 * @param lastName
	 */
	public node(String id, String firstName, String lastName ) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	// Default constructor 
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
