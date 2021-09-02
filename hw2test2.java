package COMSC2;

import java.util.Scanner;

public class hw2test2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		int[] gcdArray = new int[5];
		System.out.println("Enter the 5 values in your array: ");

		for (int i = 0; i < 5; i++) {
			gcdArray[i] = k.nextInt();
		}

		int result = 0;

		// Loop through the array and find GCD
		// by combining the GCD of previous numbers
		for (int i = 1; i < gcdArray[i]; i++) {
			result = (gcdArray[i] % i);
			
		}
		System.out.print("GCD: " + result);
		k.close();
	}

// function to find GCD of two numbers
//	public static int findGCD(int a, int b) {
//		if (b == 0)
//			return a;
//		return findGCD(b, a % b);
//	}

}
