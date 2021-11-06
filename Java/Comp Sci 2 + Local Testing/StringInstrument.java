package CompSci2;

public class StringInstrument extends Instrument {

	private int numStrings;
	private int numFrets;

	public void setNumOfStrings(int num) {
		numStrings = num;
	}

	public void setNumOfFrets(int numF) {
		numFrets = numF;
	}

	public int getNumOfStrings() {
		return numStrings;
	}

	public int getNumOfFrets() {
		return numFrets;
	}

}