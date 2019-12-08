public class BasketballPlayer extends Player {
	private int freeThrow;

	public BasketballPlayer(int number, String participant, String position,
			int freeThrow) {
		super(number, participant, position);
		this.freeThrow = freeThrow;
	}

	public int getFreeThrow() {
		return freeThrow;
	}

	public void setFreeThrow(int freeThrow) {
		this.freeThrow = freeThrow;
	}

	@Override
	public String toString() {
		return "BasketballPlayer [" + super.toString() + "freeThrow="
				+ freeThrow + "]";
	}

}
