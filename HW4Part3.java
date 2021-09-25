package COMSC2;

public class HW4Part3 {

	public static void main(String[] args) {
		HW4Part3 instantiate = new HW4Part3();
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int rolls = instantiate.rollingForPair(d1, d2, 1);
		System.out.println("The number of times to get a pair with two die: " + rolls);

	}

	public int rollingForPair(Dice d1, Dice d2, int val) {

		int rollCount = 0, firstDie = 0, secondDie = 0, temp = 0;
		// putting vars like this for readability
		do {
			d1.roll();
			d2.roll();

			firstDie = d1.getValue();
			secondDie = d2.getValue();

			rollCount++;

			if (firstDie == secondDie) {
				if (firstDie == val) {
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

}
