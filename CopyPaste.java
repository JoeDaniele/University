package COMSC2;

import java.util.Scanner;
public class CopyPaste {

	public static void main(String[] args) {
		System.out.print("Enter the 10 floating point numbers:");
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		System.out.println("The average is " + average(numbers));
		input.close();
	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;

	}

	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;

	}

}


