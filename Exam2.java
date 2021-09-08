package DiscreteStructures;

import java.util.Scanner;

/*Programming Exam: Use the cashier's algorithm. Develop a program that randomly selects a total charge. 
 * Then randomly select a payment in dollars and cents that exceeds that charge. 
 * Then have the program calculate the change in pennies, nickels, dimes, quarters, ones, fives, and twenties. 
 */

public class Exam2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int pennies, nickels, dimes, quarters;
		float dollars;

		System.out.print("Pennies: ");
		pennies = input.nextInt();

		System.out.print("Nickels: ");
		nickels = input.nextInt();

		System.out.print("Dimes: ");
		dimes = input.nextInt();

		System.out.print("Quarters: ");
		quarters = input.nextInt();

		dollars = (float) ((0.01 * pennies) + (0.05 * nickels) + (0.10 * dimes) + (0.25 * quarters));

		System.out.println();
		System.out.print("The total in dollars is $" + dollars);
		System.out.println();
		input.close();
	}

}
