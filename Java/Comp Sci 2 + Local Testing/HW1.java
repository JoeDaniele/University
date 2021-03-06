package COMSC2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {

		primeFunction1();

	}

	public static void algebraAPR() {
		System.out.println("This is a simple interest calculation."
				+ "\nThe principal value is $10,000, the interest rate is 3.875," + "\nand it will accrue for 30 years."
				+ "\nA=P(1+rt)");
		double p = 10000;
		double r = .03875;
		double t = 30;
		double answer = (p * (1 + r * t));
		System.out.println("equals " + answer);

	}

	public static void squareRoot() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number you'd like to find the square root of: ");

		double sqrt = input.nextDouble();

		System.out.println("The square root of " + sqrt + " is " + Math.sqrt(sqrt));

		input.close();

		System.out.println("\nTo elaborate, when using the sqrt tool, it"
				+ "\n\"returns the correctly rounde d positive square root of a double value.\"");
	}

	public static void primeFunction1() {

		int number = 0;
		String primeNumbers = "";

		for (number = 1; number <= 100; number++) {
			int factorCount = getFactorCount(number);
			if (factorCount == 2) {

				primeNumbers = primeNumbers + number + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are: " + primeNumbers);

		System.out.println(primeNumbers.length());

	}

	public static int getFactorCount(int number) {

		int factorCount = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factorCount++;
			}
		}
		return factorCount;
	}

	static void booleanPrime() {

		List<Integer> primeNumbers = new ArrayList<>();

		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int factor = 2; factor <= i / 2; factor++) {
				if (i % factor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNumbers.add(i);
				System.out.println("Prime numbers from 1 to 100 are: " + primeNumbers);

			}
		}

	}
	/*
	 * In my opinion the only solution requiring documentation are the two
	 * methods/functions on lines 49 + 64, so here it is.
	 *
	 * For loops are built upon an initialization statement, operational condition
	 * and an update statement. In this scenario, the two variables, "int number"
	 * set to 0, and the empty string are created as they will be updates throughout
	 * the method.
	 *
	 * I initialize the for loop by setting the number integer to 1, setting the
	 * condition to <=100, and the update statement to increment by 1.
	 *
	 * I then create a variable titled factors, which holds the value calculated in
	 * the next method, another loop.
	 *
	 * Entering that method on line 64, we see that the method is declared to hold
	 * an integer I begin by creating a new counter, factorCount, setting it to 0 --
	 * inevitably to be updated.
	 *
	 * The 2nd for loop begins, which creates an index at 1, imports the 'number'
	 * from primeFunction1, and increments AFTER it has been ran through the loop.
	 *
	 * The loop itself takes that imported number from primeFunction1, says how many
	 * times the index(i) goes into the number, determines if its prime as it has no
	 * factors outside of itself and 1
	 *
	 * that knowledge is stored to factorCount, which increments and the method,
	 * upon validating this, will return a new value to factor count.
	 *
	 * I called that factorCount on line 55, "factors" on line for visual
	 * consistency if the modulo calculated is equal to 2, meaning literally it has
	 * 2 factors (1 and itself) then we add that to the list only until the
	 * operational condition in the for loop is met.
	 *
	 * and divides it by i if the number has a modulo (remainder) equal to 0
	 */

}