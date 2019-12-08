package Map;

public class mapsEntry {
	// two array for two different data
	String email[] = new String[5];
	String name[] = new String[5];

	/**
	 * map constructor
	 * 
	 * @param key
	 * @param value
	 */
	public mapsEntry(String email, String name) {
		super();
		this.email[0] = email;
		this.name[0] = name;
	}

	// default constructor
	public mapsEntry() {
	}

	public void input(String email, String name) { // data input
		if (email != null && name != null) { // see both key and value is null
			for (int i = 0; i < this.email.length; i++) { // loop through all
															// the key
				if (this.email[i] == null) { // if key is null
					this.email[i] = email; // then issue new key
					this.name[i] = name; // issuing new value to key
					break;
				}
			}
		}
	}

	public void serch(String data) { // email as search the value
		for (int i = 0; i < email.length; i++) { // loop through the key
			if (email[i] == data) { // if key found
				System.out.println(email[i] + " " + name[i]); // print searched
																// key with
																// value
				break;
			}
		}
	}

	public void print() { // to print all the key and value
		for (int i = 0; i < email.length; i++) {
			if (email[i] != null) {
				System.out.println(email[i] + " " + name[i]);
			}
		}
	}

	public void remove(String key) { // removing key from the array
		for (int i = 0; i < this.email.length; i++) {
			if (this.email[i] == key) { // if email equal to key
				this.email[i] = null; // both email and name implemented to null
				this.name[i] = null;
				System.out.println(this.email[i] + " " + name[i]);
			}
		}
	}
}
