package DiscreteStructures;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("This program will choose one of four rules at random "
				+ "and explain the rules of the sequence. \nAfterwards the user will "
				+ "be given 4 terms within that sequence, and choose the 5th.\n");

		int ruleChosen = chooseRule();
		System.out.println("The Rule is: " + ruleChosen);

		int nextNumber = 0;

		switch (ruleChosen) {
		case 1:
			nextNumber = arithmetic();
			break;
		case 2:
			nextNumber = geometric();
			break;
		case 3:

			break;
		case 4:

			break;
		}

		System.out.println("Enter the next value in the series:");
		int userAnswer = input.nextInt();
		if (userAnswer == nextNumber) {
			System.out.println("Well done!");
		} else {
			System.out.println("Try again!");
		}

		input.close();
	}
	
	public static int chooseRule() {
		return (int) (Math.random() * 4 + 1);
	}

	public static int arithmetic() {
		System.out.println("\nArithmetic\n");
		int startingNumber = (int) (Math.random() * 100 + 1);
		int difference = (int) (Math.random() * 10 + 1);

		for (int i = 0; i < 4; i++) {
			System.out.print("Item:" + (i + 1) + ", ");
			System.out.println("Term: " + (startingNumber + difference * i));
		}
		return (startingNumber + difference * 4);

	}

	public static int geometric() {
		System.out.println("\nGeometric\n");

		int startingNumber = (int) (Math.random() * 100 + 1);
		int ratio = (int) (Math.random() * 5 + 1);
		for (int i = 0; i < 4; i++) {
			System.out.print("Item:" + (i + 1) + ", ");
			System.out.println("Term: " + (startingNumber + Math.pow(ratio, i)));
		}
		// Math.pow: Returns the value of the first
		// argument raised to the power of thesecond argument.

		return (int) (startingNumber + Math.pow(ratio, 4));

	}

	public static int recurrence() {
		System.out.println("\nRecurrence\n");

		return 0;

	}

	public static int fibonacci() {
		System.out.println("\nFibonacci\n");

		return 0;

	}


}

/*
 * I took a minute to review the video posted to fully understand the question.
 * At this current moment I already know how to create several methods, four of
 * which will hold the rules, one of which will select the rule at random. I'll
 * be sparsely looking while writing the code to ensure I'm doing this
 * correctly.
 * 
 * 
 * 
 * Rule 1:Geometric Progression A rule geometric progression is sequence of the
 * form a, ar, ar^2, ar^n where the initial term a and the common ration r are
 * real numbers.
 * 
 * Rule 2: Arithmetic progression is a sequence of the form a, a+d, a + 2d, . .
 * . , a + nd, . . . where the initial term a and the common difference d are
 * real numbers.
 * 
 * Rule 3: Recurrence let {an} be a sequence that satisfies the recurrence
 * relation an = an-1 +3 for n = 1 ,2 ,3 . . . suppose that a0 = 2; what are a1,
 * a2, a3? Solution: we see from the recurrence relation that a1 = a0 + 3 = 2 +
 * 3 = 5, it then follows that a2 = 5 + 3 = 8 and a3 = 8 + 3 = 11
 * 
 * Rule 4: Fibonacci f0, f1, f2, . . . defined by the initial conditions f0 = 0,
 * f1 = 1 and the recurrence relation fn = fn-1 + fn-2 for n = 2, 3, 4, . . . .
 * .
 *
 */
