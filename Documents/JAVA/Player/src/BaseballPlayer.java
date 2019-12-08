public class BaseballPlayer extends Player {
	private double battingAvg;

	public BaseballPlayer(int number, String participant, String position,
			double battingAvg) {
		super(number, participant, position);
		this.battingAvg = battingAvg;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	@Override
	public String toString() {
		return "BaseballPlayer [" + super.toString() + "battingAvg="
				+ battingAvg + "]";
	}

}
