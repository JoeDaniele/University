package CompSci2;

public class HW4Part3 {

	public int rollingForPair(GVdie d1, GVdie d2, int val) {

		int rollCount = 0, val1 = 0, val2 = 0, temp = 0;

		do {
			d1.roll();
			d2.roll();

			val1 = d1.getValue();
			val2 = d2.getValue();

			rollCount++;

			if (val1 == val2) {
				if (val1 == val) {
					temp = val;
				} else {
					temp = 0;
				}
			} else {
				temp = 0;
			}
		} while (temp != val);
		return rollCount;
	}

	public static void main(String[] args) {
		HW4Part3 game = new HW4Part3();
		GVdie d1 = new GVdie();
		GVdie d2 = new GVdie();
		int rolls = game.rollingForPair(d1, d2, 2);
		System.out.println("The number of times to get a pair with two die: " + rolls);

	}

}