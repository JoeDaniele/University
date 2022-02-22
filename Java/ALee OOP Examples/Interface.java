package aLee;

interface Lion { 							//NEW INTERFACE LION
	public void stalk(); 					//METHODS WITHIN LION INTERFACE
	public void run();						//METHODS MUST BE USED IN NEW CLASSES
}

class BabyLion implements Lion { 			// BABYLION CLASS INHERITS LION INTERFACE 
	public void stalk() {					 // FIRST
		System.out.println("Stalking");
	}

	public void run() { 					// SECOND
		System.out.println("Running"); 
	}

	public void scare() {					// NEW 
		System.out.println("if you scared");
	}	
}

class LionKing implements Lion{	
	public void stalk() {					
		System.out.println("stalking");
	}

	public void run() { 				
		System.out.println("Running"); 
	}

	public void scare() {
		System.out.println("go to church");
	}
	public void dillyDally() {
		System.out.println("Dilly dallying");
	}
	public void jog() {
		System.out.println("jogging");
	}
}

public class Interface { // "MAIN" CLASS
	public static void main(String[] args) { // MAIN METHOD

		BabyLion bl = new BabyLion();
		bl.run();
		bl.stalk();
		bl.scare();
		
		System.out.println();
		System.out.println();
		
		LionKing lk = new LionKing();
		lk.dillyDally();
		lk.jog();
		lk.scare();
	}
}

/*
 * AN INTERFACE IS AN ABSTRACT CLASS WITH NO IMPLEMENTED METHODS.
 * YOU CANNOT USE AN INTERFACE DIRECTLY IN THE MAIN METHOD.
 * 
 * 
 */
