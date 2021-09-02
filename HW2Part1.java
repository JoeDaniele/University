package COMSC2;

import java.util.Arrays;
import java.util.Scanner;

//problem: using overloaded method -- i cannot pull the value stored in 1 method, to the other method. 
// #1 (Average an array) Write two overloaded functions that return the average
// of an array
// Write a test program that prompts the user to enter ten values, invokes this
// method, and displays the average value.

public class HW2Part1 {
	public static void main(String[] args) {
		average();

	}

	public static void average() {
		Scanner k = new Scanner(System.in);
		int[] array = new int[10];

		System.out.println("Enter the 10 values in your array: ");

		for (int i = 0; i < 10; i++) { // ++ arithmetic operator
			array[i] = k.nextInt();
		}
		double total = 0;
		for (int i : array) {
			total += i; // += assignment operator; increases "total" based on the index in the array
		}

		System.out.println("That totals to: " + total);

		double average = total / 10;
		System.out.println("Which has an average of: " + average);
		k.close();
	}

	public void average(int userInputForArrayValues) {
		System.out.println();

	}
}

