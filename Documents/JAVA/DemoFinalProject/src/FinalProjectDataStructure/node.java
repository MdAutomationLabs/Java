package FinalProjectDataStructure;


public class node {
	private int id; // data type
	private String firstName; // data type
	private String lastName;// data type
	private String position; // data type
	private int salary;
	private String startDate;
	private String address; // data type
	private String city; // data type
	private int zip; // data type
	 node next; // to increment next
     node previous; // to go back to previous
     
     public node(){
    	 
     }
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
	public node(int id, String firstName, String lastName, String position,
			int salary, String startDate, String address, String city, int zip) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.salary = salary;
		this.startDate = startDate;
		this.address = address;
		this.city = city;
		this.zip = zip;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "node [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", position=" + position + ", salary=" + salary
				+ ", startDate=" + startDate + ", address=" + address
				+ ", city=" + city + ", zip=" + zip + "]";
	}

}
