package DiscreteStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam3Edit {
	public static void main(String[] args) {

		primeFunction();

	}

	public static void primeFunction() {
		Scanner k = new Scanner(System.in);

		System.out.println("Enter any number greater than 1, preferably less than 1 million: ");

		int userInput = k.nextInt();
		k.close();

		int i = 0;
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (i = 1; i <= userInput; i++) {
			int factorCount = getFactorCount(i);
			if (factorCount == 2) {

				primeNumbers.add(i);
			}
		}
		System.out.println("Prime numbers from 1 to " + userInput + " are: " + primeNumbers);
		System.out.println("The number of primes are: " + primeNumbers.size());

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
}
