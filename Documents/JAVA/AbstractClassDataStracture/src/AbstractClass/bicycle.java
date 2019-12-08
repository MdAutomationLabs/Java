package AbstractClass;

public class bicycle extends cycle {

	public bicycle(int t, int m, int s) { // bicycle constructor to create an
											// instance of cycle class

		this.numberOfTires = t;
		this.numberOfFlats = m;
		this.speed = s;

	}

	public void ride() { // ride method to speed up the bicycle

		speed += 1;
	}

	public void brake(int stop) {// break method to stop the bicycle

		this.speed = stop;
	}

	/*
	 * toString to format the output in tester class (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "bicycle [numberOfTires=" + numberOfTires + ", numberOfFlats="
				+ numberOfFlats + ", speed=" + speed + "]";
	}

}
