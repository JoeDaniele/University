package aLee;

enum Difficulty {
	EASY,
	MEDIUM,
	HARD,
	EXTREME
}

public class Enums {
	public static void main(String[]args) {
		
		Difficulty d = Difficulty.EASY;
		System.out.println(d);
		
	}
}


/* AN ENUM IS A GROUP OF CONSTANTS -- VARIABLES THAT DO NOT CHANGE
* NOT USED TOO OFTEN, CAN MAKE CODE MORE ORGANIZED
* PARTICULARLY WHEN USING ENUM WITH A SWITCH STATEMENT 
* 
*/