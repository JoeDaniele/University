package COMSC2;

import java.util.Random;
import java.util.Scanner;

/*#2) 26.7 LAB: How many dice rolls?
Given a GVDie object and an integer that represents the total sum desired as parameters, complete function roll_total() 
that returns the number of rolls needed to achieve at least the total sum.

Note: For testing purposes, the GVDie object is created in the main() function using a pseudo-random number generator with a fixed seed value. 
The program uses a seed value of 15 during development, but when submitted, a different seed value will be used for each test case. 
Refer to the textbook section on random numbers to learn more about pseudo-random numbers.

Ex: If the GVDie object is created with a seed value of 15 and the input of the program is:
 * 
 */

public class HW3Part2 {
	public static int rollTotal(GVdie d, int total) {

		int rolls = 0;
		int currentTotal = 0;
		while (currentTotal < total) {
			d.roll();
			currentTotal += d.getValue();
			rolls++;
		}
		return rolls;
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		GVdie die = new GVdie();
		int total;
		int rolls;

		total = k.nextInt();
		rolls = rollTotal(die, total);
		System.out.println("Number of rolls to reach at least" + total + ":" + rolls);

		k.close();
	}

}
