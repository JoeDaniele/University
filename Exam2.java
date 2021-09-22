package DiscreteStructures;

import java.util.Scanner;
/*Programming Exam: Use the cashier's algorithm. Develop a program that randomly selects a total charge. 
 * Then randomly select a payment in dollars and cents that exceeds that charge. 
 * Then have the program calculate the change in pennies, nickels, dimes, quarters, ones, fives, and twenties. 
 */

public class Exam2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double charge, payment;
		// double pennies, nickels, dimes, quarters, ones, fives, twenties;
		double change;

		charge = (int) (Math.random() * 100);
		System.out.println("Customers order totals to: $" + charge);

		do {
			payment = (int) (Math.random() * 100);

		} while (payment <= charge);

		System.out.println("Customer gives you: $" + payment);

		change = (payment - charge);

		System.out.println("You give the customer: $" + change + " in change.");

		// dollars = ((0.01 / pennies) + (0.05 / nickels) + (0.10 / dimes) + (0.25 /
		// quarters));
		// System.out.println();
		// sSystem.out.print("The total in dollars is $" + dollars);
		// System.out.println();
		input.close();
	}
}
