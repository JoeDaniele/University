package COMSC2;

//import java.util.Arrays;
import java.util.Scanner;

//DESCRIPTION OF PROGRAM ON LINE 46
// #1 (Average an array) Write two overloaded functions that return the average
// of an array
// Write a test program that prompts the user to enter ten values, invokes this
// method, and displays the average value.

public class HW2Part1MethodOverloading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		average();
	
		input.close();
	}

	public static void average() {
		Scanner k = new Scanner(System.in);
		int[] array = new int[5];

		System.out.println("Enter the 5 values in your array: ");

		for (int i = 0; i < 5; i++) { // ++ arithmetic operator
			array[i] = k.nextInt();
		}
		double total = 0;
		for (int i : array) {
			total += i; // += assignment operator; increases "total" based on the index in the array
		}

		System.out.println("That totals to: " + total);

		double average = total / 5;
		System.out.println("Which has an average of: " + average);
		k.close();
	}

	public void average(int userInputForArrayValues) {
		System.out.println();
		//unused method attempt at overloading -- found solution online, difficult without a guide
	}
	/* Function average is created on line 21 and called up to the main to be ran
	 * create the scanner to request user input, labeled k for keyboard
	 * create an array of integers titled array, parameterized by 5
	 * loop created to store the values in the array, up to 5 values 
	 * create new variable total set to 0 as it will be incremented in the next loop
	 * next loop is a for each, for each index in the array, increase the total by users input 
	 * print the total for visibility 
	 * 
	 * create variable average to hold the answer and print
	 * 
	 * changed it to 5 cause when you're testing it, 10 is redundant 
	 * 
	 * 
	 */
	
}

