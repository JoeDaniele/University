package COMSC2;

import java.util.Scanner;
// Could have used encapsulation by calling the functions w/
// getters/setters, by creating another file with the methods below.
// I would have done this if I wanted to try and capture all multiple answers into one program.

// I'll try that soon it's probably a good little project

public class HW4Part1 {
	static int bottles = 20; // "initial inventory is 20"

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many bottles did you sell?");
		int drinks = input.nextInt();
		System.out.println("When restocking the inventory, how many bottles do you return?");
		int restockBottles = input.nextInt();

		purchase(drinks);
		restock(restockBottles);
		report();
		input.close();
	}

	public static void purchase(int amount) {
		bottles = bottles - amount;
	}

	public static void report() {
		System.out.println("Inventory: " + bottles + " bottles.");
	}

	public static void restock(int amount) {
		bottles = bottles + amount;
	}

	public int getInventory() {
		return bottles;
	}
}
