package COMSC2;

public class Dice { // called in each

	private int myValue;

	public Dice() { // capital letter sets this as a contructor (the method that makes this object)
		myValue = (int) (Math.random() * 6 + 1);
	}

	public int getValue() {
		return myValue;
	}

	public void roll() {
		myValue = (int) (Math.random() * 6 + 1);
	}

}
