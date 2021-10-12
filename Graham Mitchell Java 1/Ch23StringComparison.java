package hardway; // More String Comparisons
import java.util.Scanner; // User input
import static java.lang.System.*; // imports java system -- System.Out
public class Ch23StringComparison { // class
	public static void main(String[] args) {  // main method
		Scanner keyboard = new Scanner(System.in);  //keyboard user input
		String name; // string name to be determined 
		
		out.print("Enter a programming language: "); // simple print 
		name = keyboard.nextLine(); // nextLine reads line e.g. "read this"
		 
		if (name.compareTo("C++") < 0) // IF STATEMENT -- DO NOT FOLLOW WITH ;
			out.println(name + " comes BEFORE C++"); // NOW IMPLEMENT ;
		if (name.compareTo("C++") == 0) // FOLLOW UP IF -- AGAIN NO ;
			out.println("C++ isn't made up."); // ENTER ; NOW 
		if (name.compareTo("C++") > 0) // FOLLOW UP IF -- AGAINN NO ;
			out.println(name + " comes AFTER C++"); // ENTER ; NOW  
		
		// SEMI;COLONS AFTER IF STATEMENT PRINT EVERYTHING, EVERY TIME 
		if (name.compareTo("Java") < 0)
			out.println(name + " comes BEFORE Java");
		if (name.compareTo("Java") == 0)
			out.println("Java isn't made up.");
		if (name.compareTo("Java") > 0)
			out.println(name + " comes AFTER Java");
	
		//------------------------------------------------------------
		if (name.compareTo("Python") < 0)
			out.println(name + " comes BEFORE Python");
		if (name.compareTo("Python") == 0)
			out.println("Python isn't made up.");
		if (name.compareTo("Python") > 0)
			out.println(name + " comes AFTER Python");	
	}
}
