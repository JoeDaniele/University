package COMSC2;

import java.util.Scanner;

public class PrimeTest {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int temp;
		boolean isPrime = true;

		System.out.println("Enter a number: ");
		int num = keyboard.nextInt();
		keyboard.close();
		for (int i = 2; i < num / 2; i++) {

			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(num + " is a prime number");

		} else {
			System.out.println(num + " is NOT a prime number");

		}
	}
}
