package DiscreteStructures;

import java.util.ArrayList;

public class Exam3 {
	public static void main(String[] args) {

		primeFunction10();
		primeFunction100();
		primeFunction1000();
		primeFunction100000();
	}

	public static void primeFunction10() {

		int i = 0;
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (i = 1; i <= 10; i++) {
			int factorCount = getFactorCount(i);
			if (factorCount == 2) {

				primeNumbers.add(i);
			}
		}
		System.out.println("Prime numbers from 1 to 10 are: " + primeNumbers);

		System.out.println("The number of primes are: " + primeNumbers.size());

	}

	public static void primeFunction100() {

		int i = 0;
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (i = 1; i <= 100; i++) {
			int factorCount = getFactorCount(i);
			if (factorCount == 2) {

				primeNumbers.add(i);
			}
		}
		System.out.println("Prime numbers from 1 to 100 are: " + primeNumbers);

		System.out.println("The number of primes are: " + primeNumbers.size());

	}

	public static void primeFunction1000() {

		int i = 0;
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (i = 1; i <= 1000; i++) {
			int factorCount = getFactorCount(i);
			if (factorCount == 2) {

				primeNumbers.add(i);
			}
		}
		System.out.println("Prime numbers from 1 to 1,000 are: " + primeNumbers);

		System.out.println("The number of primes are: " + primeNumbers.size());

	}

	public static void primeFunction100000() {

		int i = 0;
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (i = 1; i <= 10000; i++) {
			int factorCount = getFactorCount(i);
			if (factorCount == 2) {

				primeNumbers.add(i);
			}
		}
		System.out.println("Prime numbers from 1 to 10,000 are: " + primeNumbers.size());

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
