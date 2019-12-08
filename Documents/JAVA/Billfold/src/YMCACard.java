

public class YMCACard extends Card {
	private String IdNumber;

	public YMCACard() {
		super();
	}

	public YMCACard(String n, String id) {
		super(n);
		setIdNumber(id);
	}

	public String getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(String id) {
		IdNumber = id;
	}

	public String format() {
		return super.format() + ", ID: " + IdNumber;
	}
}
