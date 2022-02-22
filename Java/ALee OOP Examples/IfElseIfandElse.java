package aLee;

public class IfElseIfandElse {

	
	
	public static void main(String [] args) {
	
	
		int x = 25;
		int y = 10;		
		practice_Elseif(x);
		
		
		practice_If(x,y);
		
		
		
}
	public static void practice_Elseif(int time) { // method for testing 
		
		
		if (time < 10) {
			System.out.println("Good morning.");
		} else if(time < 20) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		
		
	
}
	public static void practice_If(int a, int b) { // created method for testing, separate from main 
		
		
		if(a > b) {
			System.out.println(a + " is greater than " + b);
		} else { 
			System.out.println( a + " is not greater than " + b);
		}
		
		
		
	}
	
}
