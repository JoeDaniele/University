package Pluralsight;

import java.util.Scanner;

public class calcEngine {
	public static void main(String[] args) {
		double[] leftVals = { 100, 25, 225, 11 };
		double[] rightVals = { 50, 92, 17, 3 };
		char[] opCodes = { 'd', 'a', 's', 'm' };
		double[] results = new double[opCodes.length];
		// paralell arrays -- "elements in each array correspond with the other arrays"

		if (args.length == 0) {

			for (int i = 0; i < opCodes.length; i++) {
				results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
			}
			for (double currentResult : results)
				System.out.println(currentResult); 
		} else if (args.length == 1 && args[0].equals("interactive"))
			executeInteractively();
		else if (args.length == 3)
			handleCommandLine(args);
		else
			System.out.println("Provide an operation code and 2 numeric values.");
	}

	static void executeInteractively() {
		System.out.println("Enter an operation and two numbers: ");
		Scanner k = new Scanner(System.in);
		String userInput = k.nextLine();
		String[] parts = userInput.split(" ");
		performOperation(parts);
		k.close();
	}

	private static void performOperation(String[] parts) {
		char opCode = opCodeFromString(parts[0]);
		double leftVal = valueFromWord(parts[1]);
		double rightVal = valueFromWord(parts[2]);
		double result = execute(opCode, leftVal, rightVal);
		System.out.println(result);
	}

	private static void handleCommandLine(String[] args) {
		char opCode = args[0].charAt(0); //first char in the array
		double leftVal = Double.parseDouble(args[1]);// parseDouble converts string to double
		double rightVal = Double.parseDouble(args[2]);
		double result = execute(opCode, leftVal, rightVal); // call method and pass in parameters
		System.out.println(result); // print result
	}

	static double execute(char opCode, double leftVal, double rightVal) {
		double result; // parameters in method assigns results to double result
		switch (opCode) {
		case 'a':
			result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		case 'd':
			result = rightVal != 0 ? leftVal / rightVal : 0.0d;
			break; // return 0 if the value is false
		default:
			System.out.println("Invalid opCode: " + opCode);
			result = 0.0d;
			break;
		}
		return result; // return aforementioned result
	}

	static char opCodeFromString(String operationName) {
		char opCode = operationName.charAt(0); // charAt0 will grab "m" in "multiply" e.g.
		return opCode; // return the correlating opCode per users entered opCode
	}

	static double valueFromWord(String word) {
		String[] numberWords = { "zero", "one", "two", "three", "four",
							"five", "six", "seven", "eight", "nine" };
		double value = 0;
		for (int i = 0; i < numberWords.length; i++) {
			if (word.equals(numberWords[i])) {
				value = i;
				break; // break allows the loop to run, or switch statement to execute, and exit
			}
		} // 68: if the word from user equals a value in the array, the value becomes that
		return value; // this will return the numeric value of the word the user enters
	}
}
/*
 * line 45 result = rightVals[i] != 0 ? leftVals[i]/rightVals[i] : 0.0d;
 * 
 * the following will be added to the results array
 * 
 * if rightVals[index] does no equal 0 divide the leftVals[i] from rightVals[i]
 * else if rightVals[i] DOES equal zero, return 0.0d
 * 
 * e.g.
 * https://stackoverflow.com/questions/10336899/what-is-a-question-mark-and-
 * colon-operator-used-for
 * 
 * THE FOLLOWING ARE THE SAME
 * 
 * if (a > b) { result = x; } else { result = y; } === result = a > b ? x : y;
 * == boolean statement ? true result : false result;
 * if a > b then result x :(else) y; 
 */