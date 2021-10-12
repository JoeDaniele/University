package aLee;

abstract class Tiger {							 // abstract class
	void stalk() {								 // IMPLEMENTED METHOD
		System.out.println("Stalking for prey..."); // print within stalk method
	}

	abstract void run();						 // run has no code so it can be exited via ;
} 													// ^UNIMPLEMENTED METHOD

class BabyTiger extends Tiger {						 // INHERITANCE -- BabyTiger class EXTENDS Tiger
	public void run() {
		System.out.println("Running");
	}
}

class AdultTiger extends Tiger { 					// INHERITANCE -- ADULT CLASS EXTENDS TIGER ^
	public void run() {
		System.out.println("Sprinting");
	}
	
}

class WildTiger extends Tiger { 					// INHERITANCE -- ADULT CLASS EXTENDS TIGER ^
	public void run() {
		System.out.println("WILD TIGER");
	}
	
}

public class AbstractionPolymophismInheritance {

	public static void main(String[] args) { 
		
		BabyTiger bt = new BabyTiger(); // BabyTiger class assigned to bt
										// new BabyTiger method for use in main
		bt.run(); 						// bt == line 10 BabyTiger, run method will print
		
		AdultTiger at = new AdultTiger(); 	// AdultTiger class assigned to at
											// new AdultTiger method used in main
		at.run();							 // AdultTiger will call run method -- sprinting
		
		WildTiger wt = new WildTiger();
		
		wt.run();
	}
}

// YOU CANNOT MAKE AN OBJECT FROM AN ABSTRACT CLASS	
// YOU MUST USE INHERITANCE SEE LINE 10

//ABSTRACT CLASS CAN HAVE BOTH IMPLEMENTED AND UNIMPLEMENTED METHODS. 

//POLYMORPHISM = MANY FORMS OF THE SAME METHOD 
