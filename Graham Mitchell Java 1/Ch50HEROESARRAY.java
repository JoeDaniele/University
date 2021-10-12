package hardway;
import static java.lang.System.*;
import java.util.*;
public class Ch50HEROESARRAY { //something NOT in an array
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		String[] heroes = { //array of "heroes"
				"Abderus", "Joe", "Aeneas", "Ajax", "Amphitryon",
				"Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
				"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
				"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus", "Joe",
		};

		String guess; // input for guess 
		boolean found; // found boolean (TRUE OR FALSE)
		
		out.println("Pop quiz homo!"); // print and print
		out.println("Name a mortal hero from Greek Mythology: ");
		guess = k.next(); // user input for guess 
		
		// found boolean is false 
/*	    for (String hero : heroes) { // for each hero in array heroes 
			if (guess.equals(hero)) { // if user input (guess) is correct
				  //found boolean must be true 
				break;
			}
		} */		
  		int count = 0;
		for (int i = 0; i < heroes.length; i++) {
			if (guess.equals(heroes[i])) {
				count++;
			} 
		}
		out.println(guess + " appears " + count + " times in the array.");
		if (count == 0) { // if found boolean is false, print 
			out.println("\nNo, " + guess + " wasn't a Greek mortal hero.");
			k.close();
		}
	}
}