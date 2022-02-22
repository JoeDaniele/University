package aLee;

public class SoloRecursion {

	public static void main(String[] args) {

		recursion(9); // calls method -- 9 times

	}

	static void recursion(int i) { //
		if (i == 0) {
			System.out.println("Donezo.");
		} else {
			System.out.println("RECURSIONBOI");
			i--;
			// recursion(i);
		}

		// IF THE METHOD ISNT CALLED WITHIN ITSELF, THEN IT ONLY RUNS ONCE

	}
}
