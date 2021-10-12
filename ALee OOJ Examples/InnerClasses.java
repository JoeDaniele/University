package aLee;

import java.util.Scanner; // UNUSED -- IMPORTED FROM HOVERING SCANNER IN MAIN

class Outside { // OUTSIDE class before main method 
	int a = 7;  // properties of OUTSIDE class
	
	class Inside { // INSIDE class within OUTSIDE class
		int b = 4; // properties of inside class  
	}
}

public class InnerClasses {  // public keyword, class name - title
	
	public static void main(String[]args) {  
	
		Scanner keyboard = new Scanner (System.in);// UNUSED -- TESTING
		
		Outside o = new Outside(); // 
		System.out.println(o.a); //print method within outside class
		
		Outside.Inside i = o.new Inside();
		
		System.out.println(i.b); //print method within inside class
		
		
		
		
	}
}




/* INNER CLASS IS A CLASS INSIDE OF A CLASS -- NOT OFTEN USED
 * PRACTICE FOR CLASSES 
 * 
 */
