package aLee2; // e.g. package 

import java.util.Scanner; // import statement for user input

public class UserInput { // main class imo 

	public static void main(String[]args) {  // main method imo
		
		Scanner scan = new Scanner(System.in); //System.in is "standard input", 
											   //it is passed into the constructor of the scanner object
		System.out.println("Enter age:");
		int age = scan.nextInt();
		
		System.out.println("Enter favorite ice cream:");
		String favorite = scan.next();
		
		System.out.println(age + " Is your age." +"\n" + favorite + " is your favorite flavor.");
	}
}
