 
public class Address {
// Md Ahmed
	private String houseNum;
	private String street;
	private String apartment;
	private String city;
	private String state;
	private String zip;
	public Address() {
	}
	public Address(String houseNum, String street, String city, String state,
			String zip) {
		super();
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.apartment =""; 
	}
	public Address(String houseNum, String street, String apartment, String city,
			String state, String zip) {
		super();
		this.houseNum = houseNum;
		this.street = street;
		this.apartment = apartment;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
		if (getState()== null || (getZip() == null)){
			throw new  IllegalArgumentException("Object not created");
	}
	}
	public String getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		if (state.length()>= 2){
			this.state = state.substring(0,2);
		}else 
			throw new  IllegalArgumentException("Object not created");
		return state;
	}
	public void setState(String state) {
	}
	public String getZip() {
		if ( zip.length()<=5){
			this.zip = zip;
			}else 
				throw new  IllegalArgumentException("Object not created");
		return zip;
	}
	public void setZip(String zip) {
	}
	public void print(){
		System.out.println( getHouseNum()+", "+getStreet()+", "+getApartment()+"\n"+getCity()+", "+getState()+", "+getZip());
		
	}
	public String toString() {
		return "Address [houseNum=" + houseNum + ", street=" + street
				+ ", apartment=" + apartment + ", city=" + city + ", state="
				+ state + ", zip=" + zip + "]";
	}
	

	}

