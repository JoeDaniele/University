package COMSC2;

import java.util.Scanner;

//DESCRIPTION OF PROGRAM ON LINE 45
public class HW2Part2GCDivisor {
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

	// Method gcd returns the gcd of an unspecified number of integers
	public static int gcd(int... numbers) {
		int gcd = 1; // Initial gcd is 1
		boolean isDivisor; // Is number a diviser

		for (int i = 2; i < min(numbers); i++) { // this loop will only run until it reaches the smallest number in the
													// array
			isDivisor = true;
			for (int e : numbers) {
				if (e % i != 0) // if the remainder does not equal zero
					isDivisor = false; // then it is not a divisor
			}
			if (isDivisor)
				gcd = i;
		}
		return gcd;
	}

	// Method min returns the smallest integer in an array
	public static int min(int... numbers) { // ... represents variable arguments or varargs -- METHOD ACCEPTS 0 OR
											// MULTIPLE ARGS, USED WHEN NUMBER OF ARGS PASSED IS UNKNOWN
		int min = numbers[0];
		for (int e : numbers) {
			if (e < min)
				min = e;
		}
		return min;
	}
}
/*
 * Similar to the last question we need an array from the user with 5 values, so
 * we can do that in the main method no problem then we begin to pull the gcd
 * method and parameterize it with the numbers we got from the user a few lines
 * prior.
 * 
 * now we're going to break down the functions.
 * 
 * Line 20 creates an integer function gcd that wants multiple arguments passed
 * thru it, in this case the numbers in the array from the user. Similar to the
 * prime numbers question, an int of gcd is set to 1, and the divisor is
 * boolean. we begin the for loop with an initialization of 2, and condition
 * pulled from the function below, and an increment. --briefly describing next
 * function then going back-- function min will also have multiple 'numbers'
 * passed through it. this function creates variable min as an array of the
 * numbers passed for each
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
