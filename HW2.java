package CompSci2;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {

		arrayAverage();
		System.out.println();
		gcdComputation();
		System.out.println();
		exeggutor();

	}

	static void exeggutor() {
		Scanner k = new Scanner(System.in);
		// agenda -- define an overloaded array
		// write two of them e.g. same name
		// request user put of 10 values
		// average them together
		// -- for some reason were using overloaded arrays to do so but I guess we'll
		// see

		// #1 (Average an array) Write two overloaded functions that return the average
		// of an array
		// Write a test program that prompts the user to enter ten values, invokes this
		// method, and displays the average value.

		k.close();
	}

	static int gcdComputation(int a, int b) {
		Scanner k = new Scanner(System.in);

		int b1 = BigInteger.valueOf(a);
		int b2 = BigInteger.valueOf(b);
		int gcd = b1.gcd(b2);
		return gcd.intValue();

		// #2 (Computing gcd) Write a function that returns the gcd of an unspecified
		// number of integers. Write a test program that prompts the user to enter five
		// numbers, invokes the function to find the gcd of these numbers, and displays
		// the gcd.
		k.close();
	}

	static void arrayAverage() {
		// * #3 (Execution time) Write a program that randomly generates an array of
		// 100,000 numbers and a key. Estimate the execution time of invoking the linear
		// Search method. Sort the array and estimate the execution time of invoking the
		// binary Search method.
	}
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */