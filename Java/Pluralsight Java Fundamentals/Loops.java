package Pluralsight;

public class Loops {
	public static void main(String[] args) {
		
		int someValue = 4;
		int factorial = 1;
		
		while (someValue > 1) {
			factorial *= someValue;
			someValue--;
		}
		System.out.println(factorial);
		System.out.println("below this is another method");
		doWhileExample();
	}
	
	public static void doWhileExample() { // do while loop always runs at least once
		int iVal = 80; 
		
		do {
			System.out.print(iVal);
			System.out.print(" * 2 = ");
			iVal *= 2;
			System.out.println(iVal);
		} while (iVal < 25);
	}
	
	public static void forLoop() {
		
		
		
		
		
	}
}

