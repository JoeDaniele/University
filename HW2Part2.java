package COMSC2;
/*
 * agenda -- calculate gcd #2 (Computing gcd) Write a function that returns the
 * gcd of an unspecified number of integers. Write a test program that prompts
 * the user to enter five numbers, invokes the function to find the gcd of these
 * numbers, and displays the gcd.
 */
import java.util.Scanner;

public class HW2Part2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5]; 

	
		System.out.print("Enter five numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

	
		System.out.println("The greatest common divisor is " + gcd(numbers));
		input.close();
	}

	/** Method gcd returns the gcd of an unspecified number of integers */
	public static int gcd(int... numbers) {
		int gcd = 1; // Initial gcd is 1
		boolean isDivisor; // Is number a diviser

		for (int i = 2; i < min(numbers); i++) {
			isDivisor = true;
			for (int e : numbers) {
				if (e % i != 0)
					isDivisor = false;
			}
			if (isDivisor)
				gcd = i;
		}
		return gcd;
	}

	/** Method min returns the smallest integer in an array */
	public static int min(int... numbers) {
		int min = numbers[0];
		for (int e : numbers) {
			if (e < min)
				min = e;
		}
		return min;
	}
}
