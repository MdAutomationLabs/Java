public class Player {
	// Md Ahmed
	private int number;
	private String participant;
	private String position;

	public Player(int number, String participant, String position) {
		this.number = number;
		this.participant = participant;
		this.position = position;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getParticipant() {
		return participant;
	}

	public void setParticipant(String participant) {
		this.participant = participant;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString() {
		return "Player [number=" + number + ", participant=" + participant
				+ ", position=" + position + "]";
	}

}
